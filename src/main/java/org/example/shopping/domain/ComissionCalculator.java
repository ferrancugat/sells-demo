package org.example.shopping.domain;

import lombok.AllArgsConstructor;
import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SellStore;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static org.example.shopping.domain.comission.ComissionStrategyMethodFactory.getComissionStrategy;

@AllArgsConstructor
@Service
public class ComissionCalculator {

    SellStore sellStore;

    public double getSellerCommision(Date fromtDate, Date toDate, String sellerId) {
        List<Sell> sells = sellStore.getSells(fromtDate, toDate, sellerId);
        double total = 0D;
        for (Sell sell : sells) {
            total += sell.getProducts()
                    .stream()
                    .mapToDouble(product -> product.calculateComission(getComissionStrategy(product.getProductType())))
                    .sum();
        }
        return total;
    }

}
