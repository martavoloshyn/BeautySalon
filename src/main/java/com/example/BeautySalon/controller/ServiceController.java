package com.example.BeautySalon.controller;

import com.example.BeautySalon.model.Master;
import com.example.BeautySalon.model.Service;
import com.example.BeautySalon.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/{serviceId}")
    public Service get(@PathVariable long serviceId) {
        return serviceService.get(serviceId);
    }

    @GetMapping("/{serviceId}/masters")
    public List<Master> getMastersByService(@PathVariable long serviceId) {
        return serviceService.getMastersByService(serviceId);
    }

    @PutMapping("/{serviceId}")
    public void putPrice(@PathVariable long serviceId, @RequestParam int price) {
        serviceService.putPrice(serviceId, price);
    }
}
