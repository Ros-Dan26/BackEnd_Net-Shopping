/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.repositories;

import org.generation.netshoppingonline.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jft
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);
    
    @Query("SELECT u FROM User u WHERE u.phone = ?1")
    User findByPhone(String phone);
    
    @Query("SELECT u FROM User u WHERE u.mobile = ?1")
    User findByMobile(String mobile);
    
    @Query("SELECT u FROM User u WHERE u.nickname = ?1")
    User findByNickname(String nickname);
    
}
