package org.generation.netshoppingonline.controllers.payment;

import org.generation.netshoppingonline.models.payment.BankTransfer;
import org.generation.netshoppingonline.repositories.paymentRepositories.BankTransferRepository;
import org.generation.netshoppingonline.repositories.user.UserRepository;
import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import org.generation.netshoppingonline.EndPoints;

@RestController
@RequestMapping(EndPoints.ROOT + PaymentEndPoints.PAYMENT_CD)
public class BankTransferController implements PaymentEndPoints {

    private final BankTransferRepository repo;
    private final UserRepository userRepo;

    public BankTransferController(BankTransferRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @GetMapping(USER + PARAM_ID)
    public ResponseEntity<List<BankTransfer>> findByUser(@PathVariable Integer userId) {
        if (!userRepo.existsById(userId)) {
            throw new UserNotFoundException("Usuario no encontrado: " + userId);
        }
        return ResponseEntity.ok(repo.findByIdUser(userId));
    }

    @GetMapping(PARAM_ID)
    public ResponseEntity<BankTransfer> findOne(@PathVariable Integer id) {
        BankTransfer t = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Transferencia no encontrada: " + id));
        return ResponseEntity.ok(t);
    }

    @PostMapping(SAVE + PARAM_ID)
    public ResponseEntity<BankTransfer> create(@PathVariable Integer userId, @RequestBody BankTransfer body) {
        if (!userRepo.existsById(userId)) {
            throw new UserNotFoundException("Usuario no encontrado: " + userId);
        }
        body.setId(null);
        body.setIdUser(userId);
        BankTransfer saved = repo.save(body);
        return ResponseEntity.created(URI.create("/api/bank-transfers/" + saved.getId())).body(saved);
    }

    @PutMapping(PARAM_ID)
    public ResponseEntity<BankTransfer> update(@PathVariable Integer id, @RequestBody BankTransfer body) {
        BankTransfer current = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Transferencia no encontrada: " + id));
        body.setId(id);
        body.setIdUser(current.getIdUser()); // no permitir cambiar dueño
        BankTransfer saved = repo.save(body);
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping(PARAM_ID)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        BankTransfer t = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Transferencia no encontrada: " + id));
        repo.delete(t);
        return ResponseEntity.noContent().build();
    }
}
