/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author JesusFloresTemahuay
 */
public class ResponseProductImagesDTO {

    ProductView products;
    List<ImageView> images;

    public ResponseProductImagesDTO() {
    }

    public ResponseProductImagesDTO(
            ProductView products,
            List<ImageView> images) {
        this.products = products;
        this.images = images;
    }

    public ProductView getProducts() {
        return products;
    }

    public List<ImageView> getImages() {
        return images;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.products);
        hash = 59 * hash + Objects.hashCode(this.images);
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
        final ResponseProductImagesDTO other = (ResponseProductImagesDTO) obj;
        if (!Objects.equals(this.products, other.products)) {
            return false;
        }
        return Objects.equals(this.images, other.images);
    }

}
