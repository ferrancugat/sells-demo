package org.example.shopping.infrastructure.adapters;

import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SellStore;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FakeSellStore implements SellStore {

    @Override
    public void save(Sell sell) {

    }

    @Override
    public List<Sell> getSells(Date date) {
        return null;
    }

    @Override
    public List<Sell> getSells(Date fromDate, Date toDate, String sellerId) {
        return null;
    }
}
