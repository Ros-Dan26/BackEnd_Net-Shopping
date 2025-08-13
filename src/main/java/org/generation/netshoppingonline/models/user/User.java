/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "users")
public class User extends UserAbs implements Cloneable {

    public User() {
        super();
    }

    public User(
            int id, 
            int gendersId,
            String firstName,
            String lastName, 
            String middleName, 
            String preferences,
            String email, 
            String phone, 
            String mobile, 
            String nickname, 
            String password) {
        super(id,
                gendersId,
                firstName, 
                lastName, 
                middleName, 
                preferences, 
                email, 
                phone, 
                mobile, 
                nickname, 
                password);
    }

}
