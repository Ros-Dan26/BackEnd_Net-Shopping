/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.generation.netshoppingonline.exceptions.products.ProductNotFoundException;
import org.generation.netshoppingonline.models.product.ProductView;
import org.generation.netshoppingonline.models.product.ResponseProductImagesDTO;
import org.generation.netshoppingonline.repositories.product.ProductRepository;
import org.generation.netshoppingonline.repositories.product.ProductViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class ProductViewService {

    private final ProductViewRepository productViewRepository;
    private final ImageViewService imageViewService;
    private final ProductRepository productRepository;

    @Autowired
    public ProductViewService(
            ProductViewRepository productViewRepository,
            ImageViewService imageViewService,
            ProductRepository productRepository) {
        this.productViewRepository = productViewRepository;
        this.imageViewService = imageViewService;
        this.productRepository = productRepository;
    }

    public List<ResponseProductImagesDTO> findAll() {
        List<ProductView> products = productViewRepository.findAll();
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }

    public ResponseProductImagesDTO findById(int id) throws ProductNotFoundException {
        ProductView p = productViewRepository.findById(id).get();

        if (p != null) {
            ResponseProductImagesDTO r = new ResponseProductImagesDTO(
                    p,
                    imageViewService.findImageByIdProduct(id));
            return r;
        } else {
            throw new ProductNotFoundException();
        }
    }

    public List<ResponseProductImagesDTO> filterByBrand(String brand) throws ProductNotFoundException {
        List<ProductView> products = productViewRepository.filterByBrand(brand);
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }

    public List<ResponseProductImagesDTO> filterBySize(String size) throws
            ProductNotFoundException {
        List<ProductView> products = productViewRepository.filterBySize(size);
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }

    public List<ResponseProductImagesDTO> filterByColor(String color) throws
            ProductNotFoundException {
        List<ProductView> products = productViewRepository.filterByColor("#" + color);
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }
    
    public List<ResponseProductImagesDTO> filterByPrice(double price) throws
            ProductNotFoundException {
        List<ProductView> products = productViewRepository.filterByPrice(price);
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }
    
    public List<ResponseProductImagesDTO> filterByStatus(String status) throws
            ProductNotFoundException {
        List<ProductView> products = productViewRepository.filterByStatus(status);
        List<ResponseProductImagesDTO> l = new ArrayList<>();

        Iterator<ProductView> i = products.iterator();

        while (i.hasNext()) {
            ProductView next = i.next();
            l.add(
                    new ResponseProductImagesDTO(
                            next,
                            imageViewService.findImageByIdProduct(next.getId())));
        }
        return l;
    }
}
