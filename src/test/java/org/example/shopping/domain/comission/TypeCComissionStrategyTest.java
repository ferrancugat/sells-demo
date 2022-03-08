package org.example.shopping.domain.comission;

import org.example.shopping.domain.model.Product;
import org.example.shopping.domain.model.ProductType;
import org.example.shopping.utils.ProductUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TypeCComissionStrategyTest {

    public static final int PIECES = 2;
    public static final double AMOUNT = 10;

    @Test
    public void shouldReturnRightComission() {
        //given
        Product product = ProductUtils.getProduct(ProductType.TYPEC, AMOUNT, PIECES);
        ComissionStrategy comissionStrategy = ComissionStrategyMethodFactory.getComissionStrategy(product.getProductType());
        //when
        double comission = comissionStrategy.calculateCommission(product);
        //then
        assertEquals(comission,5);
    }
}