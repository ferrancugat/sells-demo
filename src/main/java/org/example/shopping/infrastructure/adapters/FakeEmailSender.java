package org.example.shopping.infrastructure.adapters;

import org.example.shopping.domain.model.Sell;
import org.example.shopping.domain.ports.EmailSender;
import org.springframework.stereotype.Service;

@Service
public class FakeEmailSender implements EmailSender {

    @Override
    public void sendEmail(Sell sell) {

    }
}
