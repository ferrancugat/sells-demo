package org.example.shopping.infrastructure.adapters;

import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SellScreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class FakeSellScreenPrinter implements SellScreenPrinter {

    @Override
    public void printSell(Sell sell) {

    }
}
