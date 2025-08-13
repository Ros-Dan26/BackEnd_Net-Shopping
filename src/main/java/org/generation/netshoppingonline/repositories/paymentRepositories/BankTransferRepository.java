package org.generation.netshoppingonline.repositories.paymentRepositories;

import org.generation.netshoppingonline.models.payment.BankTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BankTransferRepository extends JpaRepository<BankTransfer, Integer> {

    List<BankTransfer> findByIdUser(Integer idUser);

    Optional<BankTransfer> findByIdAndIdUser(Integer id, Integer idUser);
}
