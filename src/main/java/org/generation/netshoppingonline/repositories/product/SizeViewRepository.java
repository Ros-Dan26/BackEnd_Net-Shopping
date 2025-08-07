/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.product;

import org.generation.netshoppingonline.models.product.SizeView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface SizeViewRepository extends JpaRepository<SizeView, Integer>{
    @Query("SELECT u FROM SizeView u WHERE u.idProduct = ?1")
    SizeView findSizeByIdProduct(int id);
}
