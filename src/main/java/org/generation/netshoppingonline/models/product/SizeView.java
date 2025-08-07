/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "sizes_view")
public class SizeView extends SizeAbs {

    @Column(name = "id_product")
    protected int idProduct;

    public SizeView(
            int idProduct,
            int id,
            int t060,
            int t065,
            int t070,
            int t075,
            int t080,
            int t085,
            int t090,
            int t095,
            int t100,
            int t105,
            int t110,
            int t115,
            int t120,
            int t125,
            int t130,
            int t135,
            int t140,
            int t145,
            int t150,
            int t155,
            int t160,
            int t165,
            int t170,
            int t175,
            int t180,
            int t185,
            int t190,
            int t195,
            int t200,
            int t205,
            int t210,
            int t215,
            int t220,
            int t225,
            int t230,
            int t235,
            int t240,
            int t245,
            int t250,
            int t255,
            int t260,
            int t265,
            int t270,
            int t275,
            int t280,
            int t285,
            int t290,
            int t295,
            int t300,
            int t305,
            int t310,
            int t315,
            int t320,
            int t325,
            int t330) {
        super(
                id,
                t060,
                t065,
                t070,
                t075,
                t080,
                t085,
                t090,
                t095,
                t100,
                t105,
                t110,
                t115,
                t120,
                t125,
                t130,
                t135,
                t140,
                t145,
                t150,
                t155,
                t160,
                t165,
                t170,
                t175,
                t180,
                t185,
                t190,
                t195,
                t200,
                t205,
                t210,
                t215,
                t220,
                t225,
                t230,
                t235,
                t240,
                t245,
                t250,
                t255,
                t260,
                t265,
                t270,
                t275,
                t280,
                t285,
                t290,
                t295,
                t300,
                t305,
                t310,
                t315,
                t320,
                t325,
                t330);
        this.idProduct = idProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return super.toString()
                + "SizeView{" + "idProduct=" + idProduct + '}';
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 59 * hash + this.idProduct;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SizeView other = (SizeView) obj;
        return this.idProduct == other.idProduct;
    }

}
