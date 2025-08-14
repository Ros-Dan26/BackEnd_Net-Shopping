/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.address;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "address_view")
public class AddressView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_user")
    private int idUser;
    
    @Column
    private String type;
    
    @Column
    private String city;
    
    @Column
    private String state;
    
    @Column
    private String name;
    
    @Column(columnDefinition = "INTEGER")
    private long number;
    
    @Column(name = "cp_code", columnDefinition = "INTEGER")
    private long cpCode;
    
    @Column(name = "full_address")
    private String fullAddress;
    
    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime created;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime updated;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime deleted;

    public AddressView() {
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
        deleted = null;
    }

    public AddressView(
            int id, 
            int idUser, 
            String type, 
            String city, 
            String state, 
            String name, 
            long number, 
            long cpCode, 
            String fullAddress, 
            LocalDateTime created, 
            LocalDateTime updated, 
            LocalDateTime deleted) {
        this.id = id;
        this.idUser = idUser;
        this.type = type;
        this.city = city;
        this.state = state;
        this.name = name;
        this.number = number;
        this.cpCode = cpCode;
        this.fullAddress = fullAddress;
        this.created = created;
        this.updated = updated;
        this.deleted = deleted;
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
        deleted = null;
    }
    

    @Override
    public String toString() {
        return "AddressView{" + "id=" + id + 
                ", idUser=" + idUser + 
                ", type=" + type + 
                ", city=" + city + 
                ", state=" + state +
                ", name=" + name + 
                ", number=" + number + 
                ", cpCode=" + cpCode + 
                ", fullAddress=" + fullAddress + 
                ", created=" + created + 
                ", updated=" + updated + 
                ", deleted=" + deleted + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.idUser;
        hash = 29 * hash + Objects.hashCode(this.type);
        hash = 29 * hash + Objects.hashCode(this.city);
        hash = 29 * hash + Objects.hashCode(this.state);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (this.number ^ (this.number >>> 32));
        hash = 29 * hash + (int) (this.cpCode ^ (this.cpCode >>> 32));
        hash = 29 * hash + Objects.hashCode(this.fullAddress);
        hash = 29 * hash + Objects.hashCode(this.created);
        hash = 29 * hash + Objects.hashCode(this.updated);
        hash = 29 * hash + Objects.hashCode(this.deleted);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddressView other = (AddressView) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.number != other.number) {
            return false;
        }
        if (this.cpCode != other.cpCode) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.fullAddress, other.fullAddress)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.updated, other.updated)) {
            return false;
        }
        return Objects.equals(this.deleted, other.deleted);
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public long getCpCode() {
        return cpCode;
    }

    public void setCpCode(long cpCode) {
        this.cpCode = cpCode;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    public void setDeleted(LocalDateTime deleted) {
        this.deleted = deleted;
    }
    
    
}
