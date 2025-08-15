/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.sale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "details_products")
public class DetailProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_sale")
    private int idSale;

    @Column(name = "id_product")
    private int idProduct;

    @Column(columnDefinition = "DECIMAL(8,2)")
    private double discount;

    public DetailProduct() {
    }

    public DetailProduct(
            int id,
            int idSale,
            int idProduct,
            double discount) {
        this.id = id;
        this.idSale = idSale;
        this.idProduct = idProduct;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "DetailProduct{" + "id=" + id
                + ", idSale=" + idSale
                + ", idProduct=" + idProduct
                + ", discount=" + discount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        hash = 53 * hash + this.idSale;
        hash = 53 * hash + this.idProduct;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.discount) ^ (Double.doubleToLongBits(this.discount) >>> 32));
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
        final DetailProduct other = (DetailProduct) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idSale != other.idSale) {
            return false;
        }
        if (this.idProduct != other.idProduct) {
            return false;
        }
        return Double.doubleToLongBits(this.discount) == Double.doubleToLongBits(other.discount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
