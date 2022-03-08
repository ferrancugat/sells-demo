package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;

public class TypeAComissionStrategy implements ComissionStrategy{

    @Override
    public double calculateCommission(Product product) {
        return product.getPrice()/100;
    }
}
