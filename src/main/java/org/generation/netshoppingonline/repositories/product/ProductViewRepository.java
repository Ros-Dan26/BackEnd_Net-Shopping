/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.product;

import java.util.List;
import org.generation.netshoppingonline.models.product.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface ProductViewRepository extends JpaRepository<ProductView, Integer> {
    @Query("SELECT u FROM ProductView u WHERE u.brand = ?1")
    List<ProductView> filterByBrand(String brand);
    
    @Query("SELECT u FROM ProductView u WHERE u.size = ?1")
    List<ProductView> filterBySize(String size);
    
    @Query("SELECT u FROM ProductView u WHERE u.code = ?1")
    List<ProductView> filterByColor(String color);
    
    @Query("SELECT u FROM ProductView u WHERE u.price <= ?1")
    List<ProductView> filterByPrice(double price);
    
    @Query("SELECT u FROM ProductView u WHERE u.status = ?1")
    List<ProductView> filterByStatus(String status);
    
    @Query("SELECT u FROM ProductView u WHERE u.name LIKE %:word% OR u.model LIKE %:word%")
    List<ProductView> filterByWord(String word);
}
