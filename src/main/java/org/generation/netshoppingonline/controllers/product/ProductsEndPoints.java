/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.generation.netshoppingonline.controllers.product;

import org.generation.netshoppingonline.EndPoints;

/**
 *
 * @author jft
 */
public interface ProductsEndPoints extends EndPoints{


    String PARAM_PRODUCT = "/{product}";
    String PARAM_IMAGES = "/images/{id}";
    String ADD_IMAGE_FILE = "/add/image";
    String PARAM_SIZE = "/size/{id}";

    String ALL_SIZES = "lookup/sizes";
    String ALL_STATUS = "lookup/status";
    String ALL_BRANDS= "lookup/brands";
    String ALL_COLORS= "lookup/colors_products";
    
    String FILTER_BY_BRAND= "filter/brand/{brand}";
    String FILTER_BY_SIZE= "filter/size/{size}";
    String FILTER_BY_COLOR= "filter/color/{color}";
    String FILTER_BY_PRICE= "filter/price/{price}";
    String FILTER_BY_STATUS= "filter/status/{status}";

    String WORD = "/word";
}
