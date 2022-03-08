package org.example.shopping.domain.ports;


import org.example.shopping.domain.model.Sell;

import java.util.Date;
import java.util.List;

public interface SellStore {

     void save(Sell sell);
     List<Sell> getSells(Date date);
     List<Sell> getSells(Date fromDate, Date toDate, String sellerId);
}
