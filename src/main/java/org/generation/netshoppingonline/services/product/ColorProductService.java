/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.util.List;
import org.generation.netshoppingonline.models.product.ColorProduct;
import org.generation.netshoppingonline.repositories.product.ColorProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class ColorProductService {

    private final ColorProductRespository colorProductRespository;

    @Autowired
    public ColorProductService(ColorProductRespository colorProductRespository) {
        this.colorProductRespository = colorProductRespository;
    }

    public List<ColorProduct> findAll(){
        return colorProductRespository.findAll();
    }
}
