/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.user;

import org.generation.netshoppingonline.models.user.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface AvatarRepository extends JpaRepository<Avatar, Integer>{
    @Query("SELECT u FROM Avatar u WHERE u.idUser = ?1")
    Avatar findByUserId(int idUser);
}
