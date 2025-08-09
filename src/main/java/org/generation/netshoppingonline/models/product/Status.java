/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "status")
public class Status extends Tupla{

    public Status() {
    }

    public Status(int id, String name){
        super(id, name);
    }
}
