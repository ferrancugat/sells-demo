package org.example.shopping.domain;

import lombok.AllArgsConstructor;
import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SellStore;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class BestSellerRetriever {

    private SellStore sellStore;

    // assumption: there is always 1 best seller
    public String getBestSellerId(Date date) {
        List<Sell> sells = sellStore.getSells(date);
        int maxSales = 0;
        String customerId = null;
        Map<String, Integer> sellerToTotalSales = new HashMap<>();
        for (Sell sell : sells) {
            int currentSales = sellerToTotalSales.merge(sell.getSellerId(), 1, (old, increase) -> old + increase);
            if (currentSales > maxSales) {
                maxSales = currentSales;
                customerId = sell.getSellerId();
            }
        }

        return customerId;
    }
}
