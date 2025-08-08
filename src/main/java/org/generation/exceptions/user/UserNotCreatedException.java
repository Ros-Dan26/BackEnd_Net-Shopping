/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.exceptions.user;

/**
 *
 * @author JesusFloresTemahuay
 */
public class UserNotCreatedException extends RuntimeException {

    public UserNotCreatedException() {
        super("Usuario no se pudo crear.");
    }

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
            boolean phoneExist,
            boolean nickname) {
        
        StringBuilder details = new StringBuilder("Usuario no pudo ser creado ni guardado: ");
        if (emailExist) {
            details.append("El email existe. ");
        }
        if (movilExist) {
            details.append("El telefono celular existe. ");
        }
        if (phoneExist) {
            details.append("El telefono fijo existe. ");
        }
        if (nickname) {
            details.append("El nombre de usuario existe. ");
        }
        details.append(";");
        return details.toString();
    }

}
