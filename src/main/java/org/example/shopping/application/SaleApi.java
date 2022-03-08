package org.example.shopping.application;

import org.example.shopping.application.dto.SaleTypeA;
import org.example.shopping.application.dto.SaleTypeB;
import org.example.shopping.application.dto.SaleTypeC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface SaleApi {

    ResponseEntity<Void> sellTypeA(@RequestBody SaleTypeA sale);
    ResponseEntity<Void> sellTypeB(@RequestBody SaleTypeB sale);
    ResponseEntity<Void> sellTypeC(@RequestBody SaleTypeC sale);
}
