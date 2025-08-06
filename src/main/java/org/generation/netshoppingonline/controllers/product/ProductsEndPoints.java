/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.controllers.product;

import org.generation.netshoppingonline.controllers.user.*;

/**
 *
 * @author jft
 */
public interface ProductsEndPoints {
    
    String ROOT = "/api/v1/nso";
    
    String PRODUCT_VIEW = "/product";
    
    String ALL = "/all";
    String FIND = "/find";
    String SAVE = "/save";
    String UPDATE = "/update";
    String HARD_DELETE = "/hdelete";
    String SOFT_DELETE = "/sdelete";
    String LOGIN = "/login";
    
    
    String PARAM_PRODUCT = "/{product}";

    
}
