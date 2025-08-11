/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Objects;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "colors_products")
public class ColorProduct extends Tupla {

    @Column(name = "hex_code")
    private String hexCode;

    public ColorProduct() {
    }

    public ColorProduct(int id, String name) {
        super(id, name);
    }

    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "ColorProduct{" + "hexCode=" + hexCode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.hexCode);
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
        final ColorProduct other = (ColorProduct) obj;
        return Objects.equals(this.hexCode, other.hexCode);
    }

}
