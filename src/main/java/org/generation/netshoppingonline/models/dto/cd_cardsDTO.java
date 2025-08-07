package org.generation.netshoppingonline.models.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.generation.netshoppingonline.models.user.User;

import java.time.LocalDateTime;
import java.util.Objects;

public class cd_cardsDTO {
    private Long id;
    private Long id_user;
    private Long id_Bank;
    private String cardholder_name;
    private Long card_number;
    private LocalDateTime expiratio_date;


    // constructor vacio

    public cd_cardsDTO() {
    }

    // Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_Bank() {
        return id_Bank;
    }

    public void setId_Bank(Long id_Bank) {
        this.id_Bank = id_Bank;
    }

    public String getCardholder_name() {
        return cardholder_name;
    }

    public void setCardholder_name(String cardholder_name) {
        this.cardholder_name = cardholder_name;
    }

    public Long getCard_number() {
        return card_number;
    }

    public void setCard_number(Long card_number) {
        this.card_number = card_number;
    }

    public LocalDateTime getExpiratio_date() {
        return expiratio_date;
    }

    public void setExpiratio_date(LocalDateTime expiratio_date) {
        this.expiratio_date = expiratio_date;
    }

    // ToString

    @Override
    public String toString() {
        return "cd_cadrdsDTO{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", id_Bank=" + id_Bank +
                ", cardholder_name='" + cardholder_name + '\'' +
                ", card_number=" + card_number +
                ", expiratio_date=" + expiratio_date +
                '}';
    }

    // hashCode() & equals


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof cd_cardsDTO that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(id_user, that.id_user) && Objects.equals(id_Bank, that.id_Bank) && Objects.equals(cardholder_name, that.cardholder_name) && Objects.equals(card_number, that.card_number) && Objects.equals(expiratio_date, that.expiratio_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_user, id_Bank, cardholder_name, card_number, expiratio_date);
    }

    // ------------------------------
    // relacion de cd_cadrdsDTO con user 1:N
    // ------------------------------
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
