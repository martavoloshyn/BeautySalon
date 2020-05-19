package com.example.BeautySalon.service;

import com.example.BeautySalon.model.Master;
import com.example.BeautySalon.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterService {
    @Autowired
    private MasterRepository masterRepository;

    public Master get(long id) {
        return masterRepository.get(id);
    }

    public boolean post(Master master) {
        return masterRepository.post(master) == 1;
    }

    public boolean putPhone(long masterId, String phone) {
        return masterRepository.putPhone(masterId, phone) == 1;
    }

    public boolean putSalary(long masterId, int salary) {
        return masterRepository.putSalary(masterId, salary) == 1;
    }

    public boolean delete(long masterId) {
        return masterRepository.delete(masterId) == 1;
    }
}
