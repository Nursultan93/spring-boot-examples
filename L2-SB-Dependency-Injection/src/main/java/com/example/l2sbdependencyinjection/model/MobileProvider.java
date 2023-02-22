package com.example.l2sbdependencyinjection.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MobileProvider {

    private Integer id;
    private String name;

}
