/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.sale;

import java.util.List;
import org.generation.netshoppingonline.models.sale.Sale;
import org.generation.netshoppingonline.repositories.sale.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class SaleService {

    private final SaleRepository saleRepository;

    @Autowired

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    public Sale findById(int id) {
        return saleRepository.findById(id).get();
    }

    public List<Sale> findByIdUser(int id) {
        return saleRepository.findByIdUser(id);
    }
}
