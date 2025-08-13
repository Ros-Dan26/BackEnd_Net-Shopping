package org.generation.netshoppingonline.controllers.payment;

import org.generation.netshoppingonline.models.payment.CdCard;
import org.generation.netshoppingonline.repositories.paymentRepositories.CdCardRepository;
import org.generation.netshoppingonline.repositories.user.UserRepository;
import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CdCardController {

    private final CdCardRepository repo;
    private final UserRepository userRepo;

    public CdCardController(CdCardRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    /** GET /api/users/{userId}/cd-cards */
    @GetMapping("/users/{userId}/cd-cards")
    public ResponseEntity<List<CdCard>> findByUser(@PathVariable Integer userId) {
        if (!userRepo.existsById(userId)) throw new UserNotFoundException("Usuario no encontrado: " + userId);
        return ResponseEntity.ok(repo.findByIdUser(userId));
    }

    /** GET /api/cd-cards/{id} */
    @GetMapping("/cd-cards/{id}")
    public ResponseEntity<CdCard> findOne(@PathVariable Integer id) {
        CdCard c = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + id));
        return ResponseEntity.ok(c);
    }

    /** POST /api/users/{userId}/cd-cards */
    @PostMapping("/users/{userId}/cd-cards")
    public ResponseEntity<CdCard> create(@PathVariable Integer userId, @RequestBody CdCard body) {
        if (!userRepo.existsById(userId)) throw new UserNotFoundException("Usuario no encontrado: " + userId);
        body.setId(null);
        body.setIdUser(userId);
        CdCard saved = repo.save(body);
        return ResponseEntity.created(URI.create("/api/cd-cards/" + saved.getId())).body(saved);
    }

    /** PUT /api/cd-cards/{id} */
    @PutMapping("/cd-cards/{id}")
    public ResponseEntity<CdCard> update(@PathVariable Integer id, @RequestBody CdCard body) {
        CdCard current = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + id));
        body.setId(id);
        body.setIdUser(current.getIdUser()); // no permitir cambiar dueño por aquí
        CdCard saved = repo.save(body);
        return ResponseEntity.ok(saved);
    }

    /** DELETE /api/cd-cards/{id} */
    @DeleteMapping("/cd-cards/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        CdCard c = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + id));
        repo.delete(c);
        return ResponseEntity.noContent().build();
    }
}
