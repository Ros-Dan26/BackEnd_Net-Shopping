/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.products;

/**
 *
 * @author JesusFloresTemahuay
 */
public class ProductNotSaveException extends RuntimeException{

    public ProductNotSaveException() {
        super("Producto no salvado.");
    }

    public ProductNotSaveException(String message) {
        super(message);
    }

    public ProductNotSaveException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotSaveException(Throwable cause) {
        super(cause);
    }

    public ProductNotSaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
