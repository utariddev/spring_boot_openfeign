package org.utarid.openfeign_client;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final GreetingClient greetingClient;

    public MyService(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    public String printGreeting() {
        String greeting = greetingClient.getGreeting();
        System.out.println("Greeting: " + greeting);
        return greeting;
    }
}
