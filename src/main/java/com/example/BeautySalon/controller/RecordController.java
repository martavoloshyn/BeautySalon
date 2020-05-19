package com.example.BeautySalon.controller;

import com.example.BeautySalon.model.Record;
import com.example.BeautySalon.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping("/{recordId}")
    public Record get(@PathVariable long recordId) {
        return recordService.get(recordId);
    }

    @PostMapping
    public void post(@RequestBody Record record) {
        recordService.post(record);
    }

    @DeleteMapping("/{recordId}")
    public void delete(@PathVariable long recordId) {
        recordService.delete(recordId);
    }
}
