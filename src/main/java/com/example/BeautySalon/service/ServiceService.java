package com.example.BeautySalon.service;

import com.example.BeautySalon.model.Master;
import com.example.BeautySalon.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public com.example.BeautySalon.model.Service get(long id) {
        return serviceRepository.get(id);
    }

    public List<Master> getMastersByService(long id) {
        return serviceRepository.getMastersByService(id);
    }

    public boolean putPrice(long serviceId, int price) {
        return serviceRepository.putPrice(serviceId, price) == 1;
    }
}
