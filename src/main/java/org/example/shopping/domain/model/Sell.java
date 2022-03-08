package org.example.shopping.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Sell {

    private String sellerId;
    private String clientEmail;
    private List<Product> products;
    private Date sellDate;

}
