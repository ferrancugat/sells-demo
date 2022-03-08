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
import java.util.UUID;

class BestSellerRetrieverTest {
    public static final int TOTAL_SELLS = 50;
    public static final String SELLER_ID = "pepe";

    private SellStore sellStore;
    private BestSellerRetriever bestSellerRetriever;
    @BeforeEach
    public void setup() {
        SellStore sellStore = Mockito.mock(SellStore.class);
        Mockito.when(sellStore.getSells(Mockito.any())).thenReturn(getListSells(TOTAL_SELLS));
        bestSellerRetriever = new BestSellerRetriever(sellStore);
    }

    private List<Sell> getListSells(int total) {
        List<Sell> sells = new LinkedList<>();
        for (int i = 0; i < total; i++) {
            sells.add(Sell.builder()
                    .clientEmail("email")
                    .sellerId(total%2==0?SELLER_ID:getUniqueRandomString())
                    .products(List.of(ProductUtils.getProduct(ProductType.TYPEC, 10, 3)))
                    .build());
        }
        return sells;
    }

    private String getUniqueRandomString() {
        return UUID.randomUUID().toString();
    }

    @Test
    public void shouldFetchBestSeller() {
        //given
        Date now = DateUtil.now();
        //when
        String bestSellerId = bestSellerRetriever.getBestSellerId(now);
        //then
        Assertions.assertEquals(bestSellerId,SELLER_ID);
    }

}