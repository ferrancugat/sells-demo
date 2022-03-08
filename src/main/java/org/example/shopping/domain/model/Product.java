package org.example.shopping.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.shopping.domain.comission.ComissionStrategy;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Product {
    private double price;
    private String name;
    private int pieces;
    private ProductType productType;

    public double calculateComission(ComissionStrategy comissionStrategy) {
        return comissionStrategy.calculateCommission(this);
    }
}
