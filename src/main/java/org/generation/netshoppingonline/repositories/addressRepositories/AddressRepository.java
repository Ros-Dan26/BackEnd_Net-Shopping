package org.generation.netshoppingonline.repositories.addressRepositories;

import org.generation.netshoppingonline.models.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    // Para /api/addresses/by-user/{userId} y /api/users/{userId}/addresses
    List<Address> findByUserId(Integer userId);

    // Para validar pertenencia / edición / borrado por usuario
    Optional<Address> findByIdAndUserId(Integer id, Integer userId);
}
