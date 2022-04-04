package com.br.subscriptionazgraph.web.api;

import com.br.subscriptionazgraph.feign.HookDeckFeign;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.Objects;

@RestController
@RequestMapping(value = "/subscriptions", produces = "text/plain")
public class SubscriptionController {

    @Resource
    HookDeckFeign hookDeckFeign;

    @PostMapping
    public ResponseEntity<?> responseSubscription(@RequestParam("validationToken") String validationToken, @RequestBody String body) {
        if(Objects.isNull(body))
            body = "Executou o endpoint";
        hookDeckFeign.createWebHook(URI.create("https://events.hookdeck.com/e/src_c3cD8mFCRldm8ein0YSMCCfO"), body);
        return new ResponseEntity<>(validationToken, HttpStatus.OK);
    }
}
