package com.example.l2sbdependencyinjection.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileResponse {
    private String fromMobileNumber;
    private String toMobileNumber;

}
