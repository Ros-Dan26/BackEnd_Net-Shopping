/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import org.generation.netshoppingonline.exceptions.products.ImageNotAddException;
import org.generation.netshoppingonline.models.product.ImageView;
import org.generation.netshoppingonline.repositories.product.ImageViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class ImageViewService {

    private final ImageViewRepository imageViewRepository;

    @Autowired
    public ImageViewService(ImageViewRepository imageViewRepository) {
        this.imageViewRepository = imageViewRepository;
    }

    public List<ImageView> findImageByIdProduct(int id) {
        return imageViewRepository.findImageByIdProduct(id);
    }

    public void addImageToProducto(String url, int id) throws
            ImageNotAddException {
        
        ImageView i = new ImageView(id, url);
        i = imageViewRepository.save(i);
        if (i == null) {
            throw new ImageNotAddException();
        }
    }
}
