package com.br.subscriptionazgraph.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@FeignClient(name = "hookdeck-feign", url = "https://events.hookdeck.com/e/src_c3cD8mFCRldm8ein0YSMCCfO")
public interface HookDeckFeign {

    @PostMapping
    void createWebHook(URI baseUrl, @RequestBody String body);
}
