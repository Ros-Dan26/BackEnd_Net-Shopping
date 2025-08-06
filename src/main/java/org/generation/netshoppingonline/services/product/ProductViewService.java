/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.util.List;
import org.generation.netshoppingonline.exceptions.products.ProductNotFoundException;
import org.generation.netshoppingonline.models.product.ProductView;
import org.generation.netshoppingonline.repositories.product.ProductViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class ProductViewService {

    private final ProductViewRepository productViewRepository;

    @Autowired
    public ProductViewService(ProductViewRepository productViewRepository) {
        this.productViewRepository = productViewRepository;
    }

    public List<ProductView> findAll() {
        return productViewRepository.findAll();
    }

    public ProductView findById(int id) throws ProductNotFoundException{
        ProductView p = productViewRepository.findById(id).get();
        if (p != null) {
            return p;
        } else {
            throw new ProductNotFoundException();
        }
    }

}
