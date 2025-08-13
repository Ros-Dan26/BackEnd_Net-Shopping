package org.generation.netshoppingonline.services.payment;

import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.models.payment.BankTransfer;
import org.generation.netshoppingonline.repositories.paymentRepositories.BankTransferRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BankTransferService {

    private final BankTransferRepository repo;

    public BankTransferService(BankTransferRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<BankTransfer> findByUser(Integer userId) {
        return repo.findByIdUser(userId); // <- OK (no findByUserId)
    }

    public BankTransfer createForUser(Integer userId, BankTransfer incoming) {
        incoming.setId(null);
        incoming.setIdUser(userId); // <- OK (no setUserId)
        if (incoming.getDetails() == null) incoming.setDetails("Sin detalles");
        return repo.save(incoming);
    }

    public BankTransfer updateForUser(Integer userId, Integer transferId, BankTransfer changes) {
        BankTransfer current = repo.findByIdAndIdUser(transferId, userId) // <- OK (no findByIdAndUserId)
                .orElseThrow(() -> new ResourceNotFoundException("Transferencia no encontrada: " + transferId + " para usuario " + userId));

        if (changes.getIdBank() != null)               current.setIdBank(changes.getIdBank());            // <- OK (no getBankId)
        if (changes.getIdentificationNumber() != null) current.setIdentificationNumber(changes.getIdentificationNumber());
        if (changes.getDetails() != null)              current.setDetails(changes.getDetails());

        return repo.save(current);
    }

    public void deleteForUser(Integer userId, Integer transferId) {
        BankTransfer current = repo.findByIdAndIdUser(transferId, userId)
                .orElseThrow(() -> new ResourceNotFoundException("Transferencia no encontrada: " + transferId + " para usuario " + userId));
        repo.delete(current);
    }
}
