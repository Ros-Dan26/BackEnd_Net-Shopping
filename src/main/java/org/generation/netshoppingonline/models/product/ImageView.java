/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "images_products")
public class ImageView {

    @Id
    @Column
    private int id;
    
    @Column(name = "id_product")
    private int idProduct;
    
    @Column
    private String url;

    public ImageView() {
    }

    public ImageView( int idProduct, String url) {
        this.idProduct = idProduct;
        this.url = url;
    }

    @Override
    public String toString() {
        return "ImagesView{" + "id=" + id
                + ", idProduct=" + idProduct
                + ", url=" + url + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.idProduct;
        hash = 67 * hash + Objects.hashCode(this.url);
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
        final ImageView other = (ImageView) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idProduct != other.idProduct) {
            return false;
        }
        return Objects.equals(this.url, other.url);
    }

    public int getId() {
        return id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getUrl() {
        return url;
    }

}
