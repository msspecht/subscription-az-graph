package com.br.subscriptionazgraph.web.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/subscriptions", produces = "text/plain")
public class SubscriptionController {

    @PostMapping
    public ResponseEntity<?> responseSubscription(@RequestParam("validationToken") String validationToken) {
        return new ResponseEntity<>(validationToken, HttpStatus.OK);
    }
}
