package org.generation.netshoppingonline.models.address;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "address")
// Opcional, por si en algún momento agregas relaciones LAZY
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // BD: id_user
    @Column(name = "id_user", nullable = false)
    private Integer userId;

    // BD: id_type
    @Column(name = "id_type", nullable = false)
    private Integer typeId;

    // BD: id_city
    @Column(name = "id_city", nullable = false)
    private Integer cityId;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false)
    private Integer number;

    // BD: cp_code
    @Column(name = "cp_code", nullable = false)
    private Integer cpCode;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime updated;

    @Column
    private LocalDateTime deleted;

    @PrePersist
    protected void onCreate() {
        if (created == null) created = LocalDateTime.now();
        if (updated == null) updated = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = LocalDateTime.now();
    }

    public Address() {}

    // Getters & Setters (camelCase)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getTypeId() { return typeId; }
    public void setTypeId(Integer typeId) { this.typeId = typeId; }

    public Integer getCityId() { return cityId; }
    public void setCityId(Integer cityId) { this.cityId = cityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public Integer getCpCode() { return cpCode; }
    public void setCpCode(Integer cpCode) { this.cpCode = cpCode; }

    public LocalDateTime getCreated() { return created; }
    public void setCreated(LocalDateTime created) { this.created = created; }

    public LocalDateTime getUpdated() { return updated; }
    public void setUpdated(LocalDateTime updated) { this.updated = updated; }

    public LocalDateTime getDeleted() { return deleted; }
    public void setDeleted(LocalDateTime deleted) { this.deleted = deleted; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address that = (Address) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", userId=" + userId +
                ", typeId=" + typeId +
                ", cityId=" + cityId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", cpCode=" + cpCode +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
    }
}
