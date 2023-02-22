package com.example.l2sbdependencyinjection.service.impl;

import com.example.l2sbdependencyinjection.dto.MobileRequest;
import com.example.l2sbdependencyinjection.dto.MobileResponse;
import com.example.l2sbdependencyinjection.service.MobileProviderService;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

@Service
public class AzercellProvider implements MobileProviderService {

    @Override
    public MobileResponse call(MobileRequest request) {

        return MobileResponse.builder()
                .fromMobileNumber("+994502843294")
                .toMobileNumber("+994507803238")
                .build();
    }

    @Override
    public MobileResponse stopCall(MobileRequest request) {
        return new MobileResponse("+994502843294", "+994507803238");
    }

    @Override
    public BigDecimal countBalance() {
        return BigDecimal.valueOf(0.15);
    }
}
