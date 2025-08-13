// src/main/java/org/generation/netshoppingonline/services/address/AddressService.java
package org.generation.netshoppingonline.services.address;

import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.models.address.Address;
import org.generation.netshoppingonline.repositories.addressRepositories.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional(readOnly = true)
    public List<Address> findByUser(Integer userId) {
        // ✅ coincide con AddressRepository
        return addressRepository.findByUserId(userId);
    }

    public Address createForUser(Integer userId, Address incoming) {
        // Aseguramos alta nueva
        incoming.setId(null);
        // ✅ camelCase correcto en el modelo
        incoming.setUserId(userId);
        incoming.setCreated(LocalDateTime.now());
        incoming.setUpdated(LocalDateTime.now());
        incoming.setDeleted(null);
        return addressRepository.save(incoming);
    }

    public Address updateForUser(Integer userId, Integer addressId, Address changes) {
        // ✅ coincide con AddressRepository
        Address current = addressRepository.findByIdAndUserId(addressId, userId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Dirección no encontrada: " + addressId + " para usuario " + userId));

        // ✅ getters camelCase del modelo Address
        if (changes.getTypeId() != null) current.setTypeId(changes.getTypeId());
        if (changes.getCityId() != null) current.setCityId(changes.getCityId());
        if (changes.getName() != null) current.setName(changes.getName());
        if (changes.getNumber() != null) current.setNumber(changes.getNumber());
        if (changes.getCpCode() != null) current.setCpCode(changes.getCpCode());

        current.setUpdated(LocalDateTime.now());
        return addressRepository.save(current);
    }

    public void deleteForUser(Integer userId, Integer addressId) {
        // ✅ coincide con AddressRepository
        Address current = addressRepository.findByIdAndUserId(addressId, userId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Dirección no encontrada: " + addressId + " para usuario " + userId));
        addressRepository.delete(current);
    }
}
