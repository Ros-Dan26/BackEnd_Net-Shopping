
package org.generation.netshoppingonline.DOTs;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import org.generation.netshoppingonline.models.user.User;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "address")
public class AddressDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "id_type")
    private Long id_type;

    @Column(name = "id_city")
    private Long id_city;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private long number;

    @Column(name = "cp_code")
    private long cp_code;

    @Column(name = "created")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDate created;

    @Column(name = "updated")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDate updated;

    @Column(name = "deleted")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDate deleted;



    // Constructor vacio

    public AddressDTO() {
    }

    // método constructor

    public AddressDTO(Long id, Long id_user, Long id_type,
                      Long id_city, String name, long number,
                      long cp_code, LocalDate created,
                      LocalDate updated, LocalDate deleted) {
        this.id = id;
        this.id_user = id_user;
        this.id_type = id_type;
        this.id_city = id_city;
        this.name = name;
        this.number = number;
        this.cp_code = cp_code;
        this.created = created;
        this.updated = updated;
        this.deleted = deleted;
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

    public Long getId_type() {
        return id_type;
    }

    public void setId_type(Long id_type) {
        this.id_type = id_type;
    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getCp_code() {
        return cp_code;
    }

    public void setCp_code(long cp_code) {
        this.cp_code = cp_code;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public LocalDate getDeleted() {
        return deleted;
    }

    public void setDeleted(LocalDate deleted) {
        this.deleted = deleted;
    }

    // to string

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", id_type=" + id_type +
                ", id_city=" + id_city +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", cp_code=" + cp_code +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
    }


    // hashCode() & equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AddressDTO that)) return false;
        return number == that.number
                && cp_code == that.cp_code
                && Objects.equals(id, that.id)
                && Objects.equals(id_user, that.id_user)
                && Objects.equals(id_type, that.id_type)
                && Objects.equals(id_city, that.id_city)
                && Objects.equals(name, that.name)
                && Objects.equals(created, that.created)
                && Objects.equals(updated, that.updated)
                && Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id_user, id_type, id_city, name, number, cp_code, created, updated, deleted);
    }


    // ------------------------------
    // relacion de AddressDTO con user N:1
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
