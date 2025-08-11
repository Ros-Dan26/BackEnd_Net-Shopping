/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.products;

/**
 *
 * @author JesusFloresTemahuay
 */
public class ProductNotDeletedException extends RuntimeException{

    public ProductNotDeletedException() {
        super("Producto no eliminado.");
    }

    public ProductNotDeletedException(String message) {
        super(message);
    }

    public ProductNotDeletedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotDeletedException(Throwable cause) {
        super(cause);
    }

    public ProductNotDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
