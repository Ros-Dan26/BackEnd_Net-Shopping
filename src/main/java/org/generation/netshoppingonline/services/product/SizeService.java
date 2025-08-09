/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.generation.netshoppingonline.models.product.Size;
import org.generation.netshoppingonline.repositories.product.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class SizeService {

    private final SizeRepository sizeRepository;

    @Autowired

    public SizeService(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    public List<String> getAllSizes() {
        List<Size> l = sizeRepository.findAll();
        List<String> s = new ArrayList<>();
        Iterator<Size> i = l.iterator();
        while (i.hasNext()) {
            s.add(i.next().getName());
        }
        return s;
    }
}
