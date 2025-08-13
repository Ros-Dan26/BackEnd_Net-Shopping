/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
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
@Table(name = "products_view")
public class ProductView {

    @Id
    @Column(name = "id")
    private int id;
    @Column
    private String user;
    @Column
    private String status;
    @Column
    private String size;
    @Column
    private String brand;
    @Column(name = "url_brand")
    private String urlBrand;
    @Column(name = "color_product")
    private String colorProduct;
    @Column
    private String code;
    @Column
    private String name;
    @Column
    private String model;
    @Column(columnDefinition = "VARCHAR(255)")
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
    
    public ProductView() {
        
    }

    public ProductView(
            int id,
            String user,
            String status,
            String size,
            String brand,
            String urlBrand,
            String genderProduct,
            String colorProduct,
            String code,
            String name,
            String model,
            String description,
            String details,
            double price,
            LocalDateTime created,
            LocalDateTime updated,
            LocalDateTime deleted) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.size = size;
        this.brand = brand;
        this.urlBrand = urlBrand;
        this.colorProduct = colorProduct;
        this.code = code;
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

    public String getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public String getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getColorProduct() {
        return colorProduct;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public LocalDateTime getDeleted() {
        return deleted;
    }

    public String getUrlBrand() {
        return urlBrand;
    }

    public void setUrlBrand(String urlBrand) {
        this.urlBrand = urlBrand;
    }
    
    @Override
    public String toString() {
        return "ProductView{" + "id=" + id + 
                ", user=" + user +
                ", status=" + status +
                ", size=" + size +
                ", brand=" + brand +
                ", urlBrand=" + urlBrand +
                ", colorProduct=" + colorProduct + 
                ", code=" + code +
                ", name=" + name +
                ", model=" + model + 
                ", description=" + description + 
                ", details=" + details + 
                ", price=" + price + 
                ", created=" + created +
                ", updated=" + updated + 
                ", deleted=" + deleted + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.user);
        hash = 97 * hash + Objects.hashCode(this.status);
        hash = 97 * hash + Objects.hashCode(this.size);
        hash = 97 * hash + Objects.hashCode(this.brand);
        hash = 97 * hash + Objects.hashCode(this.urlBrand);
        hash = 97 * hash + Objects.hashCode(this.colorProduct);
        hash = 97 * hash + Objects.hashCode(this.code);
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.model);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.details);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.created);
        hash = 97 * hash + Objects.hashCode(this.updated);
        hash = 97 * hash + Objects.hashCode(this.deleted);
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
        final ProductView other = (ProductView) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.urlBrand, other.urlBrand)) {
            return false;
        }
        if (!Objects.equals(this.colorProduct, other.colorProduct)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
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
