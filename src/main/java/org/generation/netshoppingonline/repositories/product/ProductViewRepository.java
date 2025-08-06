/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.product;

import org.generation.netshoppingonline.models.product.ProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface ProductViewRepository extends JpaRepository<ProductView, Integer>{
    @Query("SELECT u FROM product_view WHERE u.id=?1")
    ProductView findById(int id);
}
