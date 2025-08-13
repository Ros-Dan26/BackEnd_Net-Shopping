package org.generation.netshoppingonline.repositories.paymentRepositories;

import org.generation.netshoppingonline.models.payment.CdCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CdCardRepository extends JpaRepository<CdCard, Integer> {

    List<CdCard> findByIdUser(Integer idUser);

    Optional<CdCard> findByIdAndIdUser(Integer id, Integer idUser);
}
