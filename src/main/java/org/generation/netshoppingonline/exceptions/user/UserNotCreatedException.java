/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.user;

/**
 *
 * @author a2s4t0r1f1
 */
public class UserNotCreatedException extends RuntimeException {


    public UserNotCreatedException(String message) {
        super(message);
    }

    public UserNotCreatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotCreatedException(Throwable cause) {
        super(cause);
    }

    public UserNotCreatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static String generateDetails(boolean emailExist,
            boolean movilExist,
            boolean phoneExist) {
        String details = "Usuario no pudo ser creado ni guardado: ";
        if (emailExist) {
            details = details.concat("El email existe. ");
        }
        if (movilExist) {
            details = details.concat("El telefono celular existe. ");
        }
        if (phoneExist) {
            details = details.concat("El telefono fijo existe. ");
        }
        return details;
    }

}
