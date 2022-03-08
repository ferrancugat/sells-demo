package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;

public class TypeCComissionStrategy implements ComissionStrategy{
    @Override
    public double calculateCommission(Product product) {
        return 5;
    }
}
