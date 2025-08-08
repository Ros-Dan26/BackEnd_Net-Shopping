package org.generation.netshoppingonline.DOTs;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.generation.netshoppingonline.models.user.User;

import java.util.Objects;

@Entity
@Table(name = "bank_transfer")

public class bank_transfersDTO {
    private Long id;
    private Long id_user;
    private Long id_banck;
    private Long identification_number;
    private String details;

    // contructor vacio

    public bank_transfersDTO() {
    }
    // metodo constructor


    public bank_transfersDTO(Long id, Long id_user, Long id_banck, Long identification_number, String details) {
        this.id = id;
        this.id_user = id_user;
        this.id_banck = id_banck;
        this.identification_number = identification_number;
        this.details = details;
    }
    // getters & setters

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

    public Long getId_banck() {
        return id_banck;
    }

    public void setId_banck(Long id_banck) {
        this.id_banck = id_banck;
    }

    public Long getIdentification_number() {
        return identification_number;
    }

    public void setIdentification_number(Long identification_number) {
        this.identification_number = identification_number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    // to string

    @Override
    public String toString() {
        return "bank_transfers{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", id_banck=" + id_banck +
                ", identification_number=" + identification_number +
                ", details='" + details + '\'' +
                '}';
    }

    // hash & equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof bank_transfersDTO that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(id_user, that.id_user) && Objects.equals(id_banck, that.id_banck) && Objects.equals(identification_number, that.identification_number) && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_user, id_banck, identification_number, details);
    }

    // ------------------------------
    // relacion de bannk_transfersDTO con user 1:N
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
