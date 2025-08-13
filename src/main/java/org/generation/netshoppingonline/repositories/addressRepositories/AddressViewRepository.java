/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.repositories.addressRepositories;

import java.util.List;
import org.generation.netshoppingonline.models.address.AddressView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface AddressViewRepository extends JpaRepository<AddressView, Integer> {
    List<AddressView> findByIdUser(Integer userId);
}
