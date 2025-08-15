/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jft
 */
public interface EndPoints {
    
    String ROOT = "/api/v1/nso";
    String DIRECTORY = "/nso/bin";
    String URL_SERVER = "http://jft314.ddns.net";
    String LOCAL_PATH = "/var/www/html/jftlab%s";
    
    String USER = "/user";
    String ADDRESS = "/address";
    String PRODUCT_VIEW = "/product";
    String PAYMENT_CARD = "/card";
    String PAYMENT_TRANSFER = "/transfer";
    
    String ALL = "/all";
    String FIND = "/find";
    String SAVE = "/save";
    String UPDATE = "/update";
    String HARD_DELETE = "/hdelete";
    String SOFT_DELETE = "/sdelete";
    String LOGIN = "/login";
    
    String PARAM_USER = "/{user}";
    String PARAM_ID = "/id/{id}";
    
  
    //Constantes
    List<String> ALLOWED_MIME = Arrays.
            asList(
                    "image/jpeg",
                    "image/png",
                    "image/webp",
                    "image/svg+xml",
                    "image/gif");
}
