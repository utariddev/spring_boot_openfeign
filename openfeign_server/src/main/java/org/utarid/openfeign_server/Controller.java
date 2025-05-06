package org.utarid.openfeign_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
}
