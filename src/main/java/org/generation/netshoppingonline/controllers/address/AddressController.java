package org.generation.netshoppingonline.controllers.address;

import org.generation.netshoppingonline.models.address.Address;
import org.generation.netshoppingonline.repositories.addressRepositories.AddressRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import org.generation.netshoppingonline.EndPoints;
import org.generation.netshoppingonline.models.address.AddressView;
import org.generation.netshoppingonline.repositories.addressRepositories.AddressViewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.servlet.resource.HttpResource;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(EndPoints.ROOT + EndPoints.ADDRESS)
public class AddressController implements AddressEndPoints {

    private final AddressRepository repo;
    private final AddressViewRepository addressViewRepository;

    public AddressController(AddressRepository repo,
            AddressViewRepository addressViewRepository) {
        this.repo = repo;
        this.addressViewRepository = addressViewRepository;
    }

    @GetMapping(ALL)
    public ResponseEntity<?> findAll() {
        List<AddressView> l = addressViewRepository.findAll();
        if (l != null) {
            return ResponseEntity.ok(l);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<?> findOne(@PathVariable Integer id) {
        return addressViewRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(FIND + USER + PARAM_ID)
    public ResponseEntity<?> findByUser(@PathVariable Integer id) {
        List<AddressView> a = addressViewRepository.findByIdUser(id);
        if (a != null) {
            return ResponseEntity.ok(a);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PostMapping(SAVE)
    public ResponseEntity<Address> create(@RequestBody Address address) {
        Address saved = repo.save(address);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path(SAVE).buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(location).body(saved);
    }

    @PutMapping(UPDATE)
    public ResponseEntity<Address> update(@RequestBody Address body) {
        return repo.findById(body.getId())
                .map(current -> {
                    current.setTypeId(body.getTypeId());
                    current.setCityId(body.getCityId());
                    current.setName(body.getName());
                    current.setNumber(body.getNumber());
                    current.setCpCode(body.getCpCode());

                    Address saved = repo.save(current);
                    return ResponseEntity.ok(saved);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(HARD_DELETE + PARAM_ID)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
