package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;

public interface ComissionStrategy {

    double calculateCommission(Product product);
}
