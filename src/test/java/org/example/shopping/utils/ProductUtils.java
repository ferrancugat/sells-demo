package org.example.shopping.utils;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;

public class ProductUtils {

    public static final Product getProduct(ProductType productType,double amount, int pieces){
        return Product.builder()
                .productType(productType)
                .price(amount)
                .name("coche")
                .pieces(pieces)
                .build();
    }

}
