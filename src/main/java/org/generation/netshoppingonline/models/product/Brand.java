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
@Table(name = "brands")
public class Brand extends Tupla {

    @Column
    private String url;

    public Brand() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Brand(int id, String name, String url) {
        super(id, name);
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBrand{" + "url=" + url + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.url);
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
        final Brand other = (Brand) obj;
        return Objects.equals(this.url, other.url);
    }

}
