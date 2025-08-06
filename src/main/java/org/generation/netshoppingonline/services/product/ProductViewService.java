/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.util.List;
import java.util.NoSuchElementException;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.FIND;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.PARAM_ID;
import org.generation.netshoppingonline.exceptions.products.ProductNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.models.product.ProductView;
import org.generation.netshoppingonline.models.user.User;
import org.generation.netshoppingonline.repositories.product.ProductViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    
    public List<ProductView> findAll(){
        return productViewRepository.findAll();
    }

    public ProductView findById(int id) {
        ProductView p = productViewRepository.findById(id);
        if (p != null) {
            return p;
        } else {
            throw new ProductNotFoundException();
        }
    }
    
    
}
