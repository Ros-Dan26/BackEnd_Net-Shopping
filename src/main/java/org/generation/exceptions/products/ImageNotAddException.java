/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.products;

/**
 *
 * @author JesusFloresTemahuay
 */
public class ImageNotAddException extends RuntimeException{

    public ImageNotAddException() {
        super("Imagen no agregada.");
    }

    public ImageNotAddException(String message) {
        super(message);
    }

    public ImageNotAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImageNotAddException(Throwable cause) {
        super(cause);
    }

    public ImageNotAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
