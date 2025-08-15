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
import org.generation.netshoppingonline.EndPoints;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(EndPoints.ROOT + PaymentEndPoints.PAYMENT_CARD)
public class CdCardController implements PaymentEndPoints {

    private final CdCardRepository repo;
    private final UserRepository userRepo;

    public CdCardController(CdCardRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @GetMapping(FIND + USER + PARAM_ID)
    public ResponseEntity<List<CdCard>> findByUser(@PathVariable Integer id) {
        if (!userRepo.existsById(id)) {
            throw new UserNotFoundException("Usuario no encontrado: " + id);
        }
        return ResponseEntity.ok(repo.findByIdUser(id));
    }

    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<CdCard> findOne(@PathVariable Integer id) {
        CdCard c = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + id));
        return ResponseEntity.ok(c);
    }

    @PostMapping(SAVE)
    public ResponseEntity<CdCard> create(@RequestBody CdCard body) {

        CdCard saved = repo.save(body);
        if (saved != null) {
            return ResponseEntity.created(URI.create("/api/cd-cards/" + saved.getId())).body(saved);
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PutMapping(UPDATE)
    public ResponseEntity<CdCard> update(@RequestBody CdCard body) {
        CdCard current = repo.findById(body.getId()).
                orElseThrow(() -> new ResourceNotFoundException(
                "Tarjeta no encontrada: "
                + body.getId()));

        if (current != null) {
            CdCard saved = repo.save(body);
            if (saved != null) {
                return ResponseEntity.status(HttpStatus.CREATED).body(saved);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping(HARD_DELETE + PARAM_ID)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        CdCard c = repo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                "Tarjeta no encontrada: "
                + id));
        try {
            repo.delete(c);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
