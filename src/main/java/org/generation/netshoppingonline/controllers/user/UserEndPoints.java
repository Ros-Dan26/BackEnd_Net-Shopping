/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.controllers.user;

/**
 *
 * @author jft
 */
public interface UserEndPoints {
    
    String ROOT = "/api/v1/nso";
    
    String USER = "/user";
    
    String ALL = "/all";
    String FIND = "/find";
    String SAVE = "/save";
    String UPDATE = "/update";
    String HARD_DELETE = "/hdelete";
    String SOFT_DELETE = "/sdelete";
    String LOGIN = "/login";
    
    
    String PARAM_USER = "/{user}";
    String PARAM_ID = "/id/{id}";
    String PARAM_EMAIL = "/email/{email}";
    String PARAM_PHONE = "/phone/{phone}";
    String PARAM_MOVIL = "/movil/{movil}";
    String PARAM_NICKNAME = "/nickname/{nickname}";
    String ADD_AVATAR_FILE = "/add/avatar";
    
}
