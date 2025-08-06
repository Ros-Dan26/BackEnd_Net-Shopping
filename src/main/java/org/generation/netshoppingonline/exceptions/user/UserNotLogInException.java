/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.user;

/**
 *
 * @author a2s4t0r1f1
 */
public class UserNotLogInException extends RuntimeException{

    
    public UserNotLogInException() {
        super("El Usuario no pudo iciarse");
    }

    public UserNotLogInException(String message) {
        super(message);
    }

    public UserNotLogInException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotLogInException(Throwable cause) {
        super(cause);
    }

    public UserNotLogInException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
