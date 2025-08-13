/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import java.util.List;

/**
 *
 * @author JesusFloresTemahuay
 */
public class ResponseProductImagesDTO {

    ProductView products;
    List<ImageView> images;

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

}
