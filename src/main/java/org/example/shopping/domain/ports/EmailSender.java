package org.example.shopping.domain.ports;

import org.example.shopping.domain.model.Sell;

public interface EmailSender {

    void sendEmail(Sell sell);
}
