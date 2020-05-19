package com.example.BeautySalon.repository;

import com.example.BeautySalon.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Client get(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM clients WHERE client_id=?",
                new BeanPropertyRowMapper<>(Client.class), id);
    }

    public int post(Client client) {
        return jdbcTemplate.update("INSERT INTO clients (name,surname,phone) VALUES (?,?,?)",
                client.getName(), client.getSurname(), client.getPhone());
    }

    public int putPhone(long clientId, String phone) {
        return jdbcTemplate.update("UPDATE clients SET phone=? WHERE client_id=?", phone, clientId);
    }

    public int delete(long clientId) {
        return jdbcTemplate.update("DELETE FROM clients WHERE client_id=?", clientId);
    }
}
