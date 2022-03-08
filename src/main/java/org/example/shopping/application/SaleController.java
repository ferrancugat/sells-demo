package org.example.shopping.application;

import org.example.shopping.application.dto.SaleTypeA;
import org.example.shopping.application.dto.SaleTypeB;
import org.example.shopping.application.dto.SaleTypeC;
import org.example.shopping.application.dto.mapper.SaleToSellMapper;
import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.SalesFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sales")
public class SaleController implements SaleApi{

    @Resource
    private SalesFacade salesFacade;

    @Resource
    private SaleToSellMapper saleToSellMapper;

    @PostMapping("/A")
    @Override
    public ResponseEntity<Void> sellTypeA(@RequestBody SaleTypeA sale) {
        Sell sell = saleToSellMapper.convert(sale);
        salesFacade.addNewSell(sell);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/B")
    @Override
    public ResponseEntity<Void> sellTypeB(@RequestBody SaleTypeB sale) {
        Sell sell = saleToSellMapper.convert(sale);
        salesFacade.addNewSell(sell);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/C")
    @Override
    public ResponseEntity<Void> sellTypeC(@RequestBody SaleTypeC sale) {
        Sell sell = saleToSellMapper.convert(sale);
        salesFacade.addNewSell(sell);
        return ResponseEntity.ok().build();
    }
}
