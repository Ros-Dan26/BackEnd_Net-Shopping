/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.sql.SQLIntegrityConstraintViolationException;
import org.generation.netshoppingonline.exceptions.products.ProductNotSaveException;
import org.generation.netshoppingonline.models.product.Product;
import org.generation.netshoppingonline.repositories.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(
            ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) throws
            ProductNotSaveException,
            SQLIntegrityConstraintViolationException {
        try {
            return productRepository.save(product);
        } catch (DataIntegrityViolationException e) {
            throw new SQLIntegrityConstraintViolationException();
        } catch (Exception e) {
            throw new ProductNotSaveException();
        }
    }
    
    public Product update(Product product) throws
            ProductNotSaveException,
            SQLIntegrityConstraintViolationException {
        try {
            product.setUpdated();
            return productRepository.save(product);
        } catch (DataIntegrityViolationException e) {
            throw new SQLIntegrityConstraintViolationException();
        } catch (Exception e) {
            throw new ProductNotSaveException();
        }
    }

}
