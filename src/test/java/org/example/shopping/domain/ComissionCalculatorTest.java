package org.example.shopping.domain;

import org.assertj.core.util.DateUtil;
import org.example.shopping.domain.model.ProductType;
import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SellStore;
import org.example.shopping.utils.ProductUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class ComissionCalculatorTest {

    public static final String SELLER_ID = "pepe";
    public static final int TOTAL_SELLS = 10;

    private SellStore sellStore;
    private ComissionCalculator comissionCalculator;

    @BeforeEach
    public void setup() {
        SellStore sellStore = Mockito.mock(SellStore.class);
        Mockito.when(sellStore.getSells(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(getListSells(TOTAL_SELLS));
        comissionCalculator = new ComissionCalculator(sellStore);
    }

    private List<Sell> getListSells(int total) {
        List<Sell> sells = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            sells.add(Sell.builder()
                    .clientEmail("email")
                    .sellerId(SELLER_ID)
                    .products(List.of(ProductUtils.getProduct(ProductType.TYPEC, 10, 3)))
                    .build());
        }
        return sells;
    }

    @Test
    public void shouldCalculateRightComissionAllSalesOfTypeC() {
        //given
        Date from = DateUtil.yesterday();
        Date to = DateUtil.now();
        //when
        double comission = comissionCalculator.getSellerCommision(from,to,SELLER_ID);
        //then
        Assertions.assertEquals(comission,5*TOTAL_SELLS);
    }

}