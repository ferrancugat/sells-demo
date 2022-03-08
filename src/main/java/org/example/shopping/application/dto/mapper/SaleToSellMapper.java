package org.example.shopping.application.dto.mapper;

import org.example.shopping.application.dto.Sale;
import org.example.shopping.domain.model.Sell;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleToSellMapper {

    public Sell convert(Sale sale){
       return Sell.builder()
               .sellDate(sale.getSellDate())
               .sellerId(sale.getSellerId())
               .products(List.of(sale.getProduct()))
               .clientEmail(sale.getClientEmail())
               .build();
    }
}
