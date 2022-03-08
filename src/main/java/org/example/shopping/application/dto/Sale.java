package org.example.shopping.application.dto;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Sale {

    private String sellerId;
    private String clientEmail;
    private Product product;
    private Date sellDate;

    public Sale(String sellerId, String clientEmail, Product product, Date sellDate) {
        this.sellerId = sellerId;
        this.clientEmail = clientEmail;
        this.product = product;
        this.sellDate = sellDate;
        validate();
    }

    private void validate() {
        if (product.getProductType() != getProductType()) {
            throw new IllegalArgumentException("Product can not be assigned to this type of sale");
        }
    }

    public abstract ProductType getProductType();

}
