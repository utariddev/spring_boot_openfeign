package org.utarid.openfeign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greetingClient", url = "http://localhost:8080")
public interface GreetingClient {

    @GetMapping("/greeting")
    String getGreeting();
}