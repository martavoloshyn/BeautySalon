package com.example.BeautySalon.service;

import com.example.BeautySalon.model.Client;
import com.example.BeautySalon.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client get(long id) {
        return clientRepository.get(id);
    }

    public boolean post(Client client) {
        return clientRepository.post(client) == 1;
    }

    public boolean putPhone(long clientId, String phone) {
        return clientRepository.putPhone(clientId, phone) == 1;
    }

    public boolean delete(long clientId) {
        return clientRepository.delete(clientId) == 1;
    }
}
