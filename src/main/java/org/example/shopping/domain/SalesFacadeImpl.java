package org.example.shopping.domain;

import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.EmailSender;
import org.example.shopping.domain.ports.SalesFacade;
import org.example.shopping.domain.ports.SellScreenPrinter;
import org.example.shopping.domain.ports.SellStore;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SalesFacadeImpl implements SalesFacade {

    private SellStore sellStore;
    private SellScreenPrinter sellScreenPrinter;
    private EmailSender emailSender;
    //private ApplicationEventPublisher applicationEventPublisher; Observer pattern

    @Override
    public void addNewSell(Sell sell) {
        sellStore.save(sell);
        emailSender.sendEmail(sell);
        sellScreenPrinter.printSell(sell);
        //..more
        //this.applicationEventPublisher.publishEvent(new SellEvent(this, sell));     Observer pattern
    }
}
