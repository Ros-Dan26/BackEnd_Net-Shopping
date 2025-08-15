package org.generation.netshoppingonline.models.payment;

import jakarta.persistence.*;
import java.util.Objects;
/*
@Entity
@Table(name = "bank_transfers")
public class BankTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // FK a users.id
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    // FK a banks.id
    @Column(name = "id_bank", nullable = false)
    private Integer idBank;

    @Column(name = "identification_number", nullable = false, length = 50)
    private String identificationNumber;

    @Column(nullable = false, length = 256)
    private String details = "Sin detalles";

    public BankTransfer() {}

    // --- Getters & Setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIdUser() { return idUser; }
    public void setIdUser(Integer idUser) { this.idUser = idUser; }

    public Integer getIdBank() { return idBank; }
    public void setIdBank(Integer idBank) { this.idBank = idBank; }

    public String getIdentificationNumber() { return identificationNumber; }
    public void setIdentificationNumber(String identificationNumber) { this.identificationNumber = identificationNumber; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankTransfer)) return false;
        return Objects.equals(id, ((BankTransfer) o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
}
*/