package org.generation.netshoppingonline.services.payment;

import org.generation.netshoppingonline.exceptions.common.ResourceNotFoundException;
import org.generation.netshoppingonline.models.payment.CdCard;
import org.generation.netshoppingonline.repositories.paymentRepositories.CdCardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CdCardService {

    private final CdCardRepository repo;

    public CdCardService(CdCardRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<CdCard> findByUser(Integer userId) {
        return repo.findByIdUser(userId); // <- OK (no findByUserId)
    }

    public CdCard createForUser(Integer userId, CdCard incoming) {
        incoming.setId(null);
        incoming.setIdUser(userId); // <- OK (no setUserId)
        return repo.save(incoming);
    }

    public CdCard updateForUser(Integer userId, Integer cardId, CdCard changes) {
        CdCard current = repo.findByIdAndIdUser(cardId, userId) // <- OK (no findByIdAndUserId)
                .orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + cardId + " para usuario " + userId));

        if (changes.getIdBank() != null)          current.setIdBank(changes.getIdBank());       // <- OK (no getBankId)
        if (changes.getCardholderName() != null)  current.setCardholderName(changes.getCardholderName());
        if (changes.getCardNumber() != null)      current.setCardNumber(changes.getCardNumber());
        if (changes.getExpirationDate() != null)  current.setExpirationDate(changes.getExpirationDate());

        return repo.save(current);
    }

    public void deleteForUser(Integer userId, Integer cardId) {
        CdCard current = repo.findByIdAndIdUser(cardId, userId)
                .orElseThrow(() -> new ResourceNotFoundException("Tarjeta no encontrada: " + cardId + " para usuario " + userId));
        repo.delete(current);
    }
}
