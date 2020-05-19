package com.example.BeautySalon.service;

import com.example.BeautySalon.model.Record;
import com.example.BeautySalon.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
    @Autowired
    private RecordRepository recordRepository;

    public Record get(long id) {
        return recordRepository.get(id);
    }

    public boolean post(Record record) {
        return recordRepository.post(record) == 1;
    }

    public boolean delete(long recordId) {
        return recordRepository.delete(recordId) == 1;
    }
}
