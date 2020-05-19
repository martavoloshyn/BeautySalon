package com.example.BeautySalon.controller;

import com.example.BeautySalon.model.Client;
import com.example.BeautySalon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/{clientId}")
    public Client getClient(@PathVariable long clientId) {
        return clientService.get(clientId);
    }

    @PostMapping
    public void postClient(@RequestBody Client client) {
        clientService.post(client);
    }

    @PutMapping("/{clientId}")
    public void putPhone(@PathVariable long clientId, @RequestParam String phone) {
        clientService.putPhone(clientId, phone);
    }

    @DeleteMapping("/{clientId}")
    public void delete(@PathVariable long clientId) {
        clientService.delete(clientId);
    }
}
