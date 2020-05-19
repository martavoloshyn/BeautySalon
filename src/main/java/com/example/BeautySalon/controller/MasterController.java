package com.example.BeautySalon.controller;

import com.example.BeautySalon.model.Master;
import com.example.BeautySalon.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/master")
public class MasterController {
    @Autowired
    private MasterService masterService;

    @GetMapping("/{masterId}")
    public Master get(@PathVariable long masterId) {
        return masterService.get(masterId);
    }

    @PostMapping
    public void post(@RequestBody Master master) {
        masterService.post(master);
    }

    @PutMapping("/phone/{masterId}")
    public void putPhone(@PathVariable long masterId, @RequestParam String phone) {
        masterService.putPhone(masterId, phone);
    }

    @PutMapping("/salary/{masterId}")
    public void putSalary(@PathVariable long masterId, @RequestParam int salary) {
        masterService.putSalary(masterId, salary);
    }

    @DeleteMapping("/{masterId}")
    public void delete(@PathVariable long masterId) {
        masterService.delete(masterId);
    }
}
