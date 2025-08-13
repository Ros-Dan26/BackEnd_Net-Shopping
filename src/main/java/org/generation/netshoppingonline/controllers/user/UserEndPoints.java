/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.controllers.user;

import org.generation.netshoppingonline.EndPoints;

/**
 *
 * @author jft
 */
public interface UserEndPoints  extends EndPoints{
    
    String PARAM_EMAIL = "/email/{email}";
    String PARAM_PHONE = "/phone/{phone}";
    String PARAM_MOVIL = "/movil/{movil}";
    String PARAM_NICKNAME = "/nickname/{nickname}";
    String ADD_AVATAR_FILE = "/add/avatar";
}
