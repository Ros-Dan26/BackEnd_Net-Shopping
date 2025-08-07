/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.controllers.product;

/**
 *
 * @author jft
 */
public interface ProductsEndPoints {
    
    String ROOT = "/api/v1/nso";
    String DIRECTORY = "/nso/bin";
    String URL_SERVER = "http://jft314.ddns.net";
    String LOCAL_PATH ="/var/www/html/jftlab%s/%d";
    
    String PRODUCT_VIEW = "/product";
    
    String ALL = "/all";
    String FIND = "/find";
    String SAVE = "/save";
    String UPDATE = "/update";
    String HARD_DELETE = "/hdelete";
    String SOFT_DELETE = "/sdelete";
    String LOGIN = "/login";
    
    
    String PARAM_PRODUCT = "/{product}";
    String PARAM_IMAGES = "/images/{id}";
    String ADD_IMAGE_URL = "/add/image";
    String ADD_IMAGE_FILE = "/add/file";

}
