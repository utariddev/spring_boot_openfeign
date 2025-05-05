package org.utarid.openfeign_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final MyService myService;

    public TestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/test")
    public String testFeign() {
        return myService.printGreeting();
    }
}
