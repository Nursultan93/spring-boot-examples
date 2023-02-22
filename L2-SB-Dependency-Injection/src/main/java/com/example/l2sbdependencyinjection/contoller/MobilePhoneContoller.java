package com.example.l2sbdependencyinjection.contoller;

import com.example.l2sbdependencyinjection.dto.MobileRequest;
import com.example.l2sbdependencyinjection.dto.MobileResponse;
import com.example.l2sbdependencyinjection.service.MobileProviderService;
import com.example.l2sbdependencyinjection.service.impl.AzercellProvider;
import com.example.l2sbdependencyinjection.service.impl.BakcellProvider;
import java.math.BigDecimal;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
@RequiredArgsConstructor
public class MobilePhoneContoller {

    @Qualifier("bakcellProvider")
    private final MobileProviderService mobileProviderService;

    @GetMapping("/call/{name}")
    public MobileResponse call(@PathVariable String name){
        return mobileProviderService.call(new MobileRequest(name));
    }

    @GetMapping("/end/{name}")
    public MobileResponse endCall(@PathVariable String name){
        return mobileProviderService.stopCall(new MobileRequest(name));
    }

    @GetMapping("/balance")
    public BigDecimal getBalance(){
        return mobileProviderService.countBalance();
    }
}
