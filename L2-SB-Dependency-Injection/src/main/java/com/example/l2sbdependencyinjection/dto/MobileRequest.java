package com.example.l2sbdependencyinjection.dto;

public class MobileRequest {
    private String provider;

    public MobileRequest() {
    }

    public MobileRequest(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "MobileRequest{" +
                "provider='" + provider + '\'' +
                '}';
    }
}
