package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;
import org.example.shopping.utils.ProductUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeBComissionStrategyTest {

    private static final double PRICE = 10d;
    public static final int PIECES = 5;

    @Test
    public void shouldReturnRightComission() {
        //given
        Product product = ProductUtils.getProduct(ProductType.TYPEB,PRICE, PIECES);
        ComissionStrategy comissionStrategy = ComissionStrategyMethodFactory.getComissionStrategy(product.getProductType());
        //when
        double comission = comissionStrategy.calculateCommission(product);
        //then
        Assertions.assertEquals(comission,PIECES);
    }

}