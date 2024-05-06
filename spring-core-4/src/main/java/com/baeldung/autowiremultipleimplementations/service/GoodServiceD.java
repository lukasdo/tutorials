package com.baeldung.autowiremultipleimplementations.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class GoodServiceD implements GoodService {

    public String getHelloMessage() {
        return "Hello from D!";
    }
}
