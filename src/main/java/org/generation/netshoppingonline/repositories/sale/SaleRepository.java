/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.sale;

import java.util.List;
import org.generation.netshoppingonline.models.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{
    @Query("SELECT u FROM Sale u WHERE u.idUser = ?1")
    List<Sale> findByIdUser(int id);
}
