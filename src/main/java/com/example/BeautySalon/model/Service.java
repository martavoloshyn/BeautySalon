package com.example.BeautySalon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service {
    private long serviceId;
    private String serviceName;
    private int price;
}
