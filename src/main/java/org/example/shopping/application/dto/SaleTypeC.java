package org.example.shopping.application.dto;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;

import java.util.Date;

public class SaleTypeC extends Sale {

    public SaleTypeC(String sellerId, String clientEmail, Product product, Date sellDate) {
        super(sellerId, clientEmail, product, sellDate);
    }

    @Override
    public ProductType getProductType() {
        return ProductType.TYPEC;
    }
}
