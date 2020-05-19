package com.example.BeautySalon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private long recordId;
    private long serviceId;
    private long clientId;
    private Timestamp dateTime;
}
