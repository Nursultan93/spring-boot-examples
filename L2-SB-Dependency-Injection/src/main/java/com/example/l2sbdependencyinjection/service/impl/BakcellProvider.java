package com.example.l2sbdependencyinjection.service.impl;

import com.example.l2sbdependencyinjection.dto.MobileRequest;
import com.example.l2sbdependencyinjection.dto.MobileResponse;
import com.example.l2sbdependencyinjection.service.MobileProviderService;
import java.math.BigDecimal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class BakcellProvider implements MobileProviderService {

    @Override
    public MobileResponse call(MobileRequest request) {

        return new MobileResponse("+994552843294", "+994557803238");
    }

    @Override
    public MobileResponse stopCall(MobileRequest request) {
        return new MobileResponse("+994552843294", "+994557803238");
    }

    @Override
    public BigDecimal countBalance() {
        return BigDecimal.valueOf(1.10);
    }
}
