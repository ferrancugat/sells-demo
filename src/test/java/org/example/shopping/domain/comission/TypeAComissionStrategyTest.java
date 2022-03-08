package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;
import org.example.shopping.utils.ProductUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TypeAComissionStrategyTest {

    public static final double PRICE = 50;

    @Test
    public void shouldReturnRightComission() {
        Product product = ProductUtils.getProduct(ProductType.TYPEA,PRICE,5);
        ComissionStrategy comissionStrategy = ComissionStrategyMethodFactory.getComissionStrategy(product.getProductType());
        double comission = comissionStrategy.calculateCommission(product);
        Assertions.assertEquals(comission,PRICE/100);
    }

}