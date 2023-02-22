package com.example.l2sbdependencyinjection.service;

import com.example.l2sbdependencyinjection.dto.MobileRequest;
import com.example.l2sbdependencyinjection.dto.MobileResponse;
import java.math.BigDecimal;

public interface MobileProviderService {
    MobileResponse call(MobileRequest request);
    MobileResponse stopCall(MobileRequest request);
    BigDecimal countBalance();
}
