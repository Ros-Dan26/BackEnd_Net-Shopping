/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.repositories.user;

import org.generation.netshoppingonline.models.user.UserView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JesusFloresTemahuay
 */
@Repository
public interface UserViewRepository extends JpaRepository<UserView, Integer>{
      @Query("SELECT u FROM UserView u WHERE u.email = ?1")
    UserView findByEmail(String email);
    
    @Query("SELECT u FROM UserView u WHERE u.phone = ?1")
    UserView findByPhone(String phone);
    
    @Query("SELECT u FROM UserView u WHERE u.mobile = ?1")
    UserView findByMobile(String mobile);
    
    @Query("SELECT u FROM UserView u WHERE u.nickname = ?1")
    UserView findByNickname(String nickname);
    
    @Query("SELECT u FROM UserView u WHERE u.email = ?1  AND u.password = ?2")
    UserView login(String email, String password);
}
