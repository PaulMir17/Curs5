package com.example.demo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Service
@Scope(value= WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.INTERFACES)
public class RandomColorService implements ColorService {

    private final Random random;
    private final int red;
    private final int blue;
    private final int green;

    public RandomColorService() {
        random= new Random();
        red= random.nextInt(256);
        blue= random.nextInt(256);
        green= random.nextInt(256);
    }

    @Override
    public int getRed() {
        return red;
    }
    @Override
    public int getBlue() {
        return blue;
    }

    @Override
    public int getGreen() {
        return green;
    }
}
