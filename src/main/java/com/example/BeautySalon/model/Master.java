package com.example.BeautySalon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Master {
    private long masterId;
    private String name;
    private String surname;
    private String phone;
    private int salary;
}
