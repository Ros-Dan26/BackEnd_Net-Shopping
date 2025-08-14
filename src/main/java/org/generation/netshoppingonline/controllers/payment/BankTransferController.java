package org.generation.netshoppingonline.controllers.payment;

import org.generation.netshoppingonline.models.payment.BankTransfer;
import org.generation.netshoppingonline.repositories.paymentRepositories.BankTransferRepository;
import org.generation.netshoppingonline.repositories.user.UserRepository;
import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.generation.netshoppingonline.EndPoints;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(EndPoints.ROOT + PaymentEndPoints.PAYMENT_TRANSFER)
public class BankTransferController implements PaymentEndPoints {

    private final BankTransferRepository repo;
    private final UserRepository userRepo;

    public BankTransferController(BankTransferRepository repo, UserRepository userRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
    }

    @GetMapping(FIND + USER + PARAM_ID)
    public ResponseEntity<List<BankTransfer>> findByUser(@PathVariable Integer id) {
        if (!userRepo.existsById(id)) {
            throw new UserNotFoundException("Usuario no encontrado: " + id);
        }
        return ResponseEntity.ok(repo.findByIdUser(id));
    }

    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<BankTransfer> findOne(@PathVariable Integer id) {
        BankTransfer t = repo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                "Transferencia no encontrada: "
                + id));
        return ResponseEntity.ok(t);
    }

    @PostMapping(SAVE)
    public ResponseEntity<BankTransfer> create(@RequestBody BankTransfer body) {
        BankTransfer saved = repo.save(body);
        if (saved != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(saved);
        }

    }

    @PutMapping(UPDATE)
    public ResponseEntity<BankTransfer> update(
            @RequestBody BankTransfer body) {

        BankTransfer current = repo.
                findById(body.getId()).get();

        if (current != null) {
            BankTransfer saved = repo.save(body);
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
        BankTransfer t = repo.findById(id).
                orElseThrow(() -> new ResourceNotFoundException(
                "Transferencia no encontrada: "
                + id));

        try {
            repo.delete(t);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
}
