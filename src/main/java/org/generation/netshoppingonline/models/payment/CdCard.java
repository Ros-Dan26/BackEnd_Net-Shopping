package org.generation.netshoppingonline.models.payment;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "cd_cards")
public class CdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // FK a users.id
    @Column(name = "id_user", nullable = false)
    private Integer idUser;

    // FK a banks.id
    @Column(name = "id_bank", nullable = false)
    private Integer idBank;

    @Column(name = "cardholder_name", nullable = false, length = 128)
    private String cardholderName;

    @Column(name = "card_number", nullable = false, length = 20)
    private String cardNumber;

    // OJO: en BD el nombre es 'expiratio_date' (con esa ortografía)
    @Column(name = "expiratio_date", nullable = false)
    private LocalDate expirationDate;

    public CdCard() {}

    // --- Getters & Setters ---
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getIdUser() { return idUser; }
    public void setIdUser(Integer idUser) { this.idUser = idUser; }

    public Integer getIdBank() { return idBank; }
    public void setIdBank(Integer idBank) { this.idBank = idBank; }

    public String getCardholderName() { return cardholderName; }
    public void setCardholderName(String cardholderName) { this.cardholderName = cardholderName; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public LocalDate getExpirationDate() { return expirationDate; }
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CdCard)) return false;
        return Objects.equals(id, ((CdCard) o).id);
    }
    @Override public int hashCode() { return Objects.hash(id); }
}
