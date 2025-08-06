/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.controllers.product;

import java.util.NoSuchElementException;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.ALL;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.FIND;
import static org.generation.netshoppingonline.controllers.user.UserEndPoints.PARAM_ID;
import org.generation.netshoppingonline.exceptions.products.ProductNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.models.product.ProductView;
import org.generation.netshoppingonline.services.product.ProductViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JesusFloresTemahuay
 */
@RestController
@RequestMapping(ProductsEndPoints.ROOT + ProductsEndPoints.PRODUCT_VIEW)
public class ProductViewController implements ProductsEndPoints{
    private final ProductViewService productViewService;

    @Autowired
    public ProductViewController(ProductViewService productViewService) {
        this.productViewService = productViewService;
    }
    
    @GetMapping(ALL)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(productViewService.findAll());
    }
    
    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<?> findById(@PathVariable int id) {
        ProductView p = null;
        try {
            p = productViewService.findById(id);
            System.out.println("id:" + id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(p);

        } catch (ProductNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }
}
