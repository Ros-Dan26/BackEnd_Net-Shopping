/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

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
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_status")
    private int idStatus;
    @Column(name = "id_size")
    private int idSize;
    @Column(name = "id_brand")
    private int idBrand;
    @Column(name = "id_color")
    private int idColor;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String description;
    @Column
    private String details;
    @Column(columnDefinition = "DECIMAL(8,2)")
    private double price;
    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime created;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime updated;

    @Column
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime deleted;

    public Product() {
        created = LocalDateTime.now();
        updated = LocalDateTime.now();
        deleted = null;
    }

    public Product(
            int id,
            int idUser,
            int idStatus,
            int idSize,
            int idBrand,
            int idColor,
            String name,
            String model,
            String description,
            String details,
            double price,
            LocalDateTime created,
            LocalDateTime updated,
            LocalDateTime deleted) {
        this.id = id;
        this.idUser = idUser;
        this.idStatus = idStatus;
        this.idSize = idSize;
        this.idBrand = idBrand;
        this.idColor = idColor;
        this.name = name;
        this.model = model;
        this.description = description;
        this.details = details;
        this.price = price;
        this.created = created;
        this.updated = updated;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    /**
     * Inserta un valor en updated en hora local del servidor automaticamente
     */
    public void setUpdated() {
        updated = LocalDateTime.now();
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    /**
     * Inserta un valor en deleted en hora local del servidor automaticamente
     */
    public void setDeleted() {
        deleted = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id
                + ", idUser=" + idUser
                + ", idStatus=" + idStatus
                + ", idSize=" + idSize
                + ", idBrand=" + idBrand
                + ", idColor=" + idColor
                + ", name=" + name
                + ", model=" + model
                + ", description=" + description
                + ", details=" + details
                + ", price=" + price
                + ", created=" + created
                + ", updated=" + updated
                + ", deleted=" + deleted + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.idUser;
        hash = 37 * hash + this.idStatus;
        hash = 37 * hash + this.idSize;
        hash = 37 * hash + this.idBrand;
        hash = 37 * hash + this.idColor;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.model);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.details);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.created);
        hash = 37 * hash + Objects.hashCode(this.updated);
        hash = 37 * hash + Objects.hashCode(this.deleted);
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
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.idStatus != other.idStatus) {
            return false;
        }
        if (this.idSize != other.idSize) {
            return false;
        }
        if (this.idBrand != other.idBrand) {
            return false;
        }
        if (this.idColor != other.idColor) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.details, other.details)) {
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
}
