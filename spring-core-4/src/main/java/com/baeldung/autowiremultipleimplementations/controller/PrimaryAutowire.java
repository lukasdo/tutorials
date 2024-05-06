package com.baeldung.autowiremultipleimplementations.controller;

import com.baeldung.autowiremultipleimplementations.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrimaryAutowire {

    private final GoodService goodService;

    @Autowired
    public PrimaryAutowire(GoodService goodService) {
        this.goodService = goodService;
    }

    public String hello() {
        return goodService.getHelloMessage();
    }
}
