/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.product;

import java.util.List;
import org.generation.netshoppingonline.models.product.ImageView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface ImageViewRepository extends JpaRepository<ImageView, Integer> {

    @Query("SELECT u FROM ImageView u WHERE u.idProduct = ?1")
    List<ImageView> findImageByIdProduct(int id);
}
