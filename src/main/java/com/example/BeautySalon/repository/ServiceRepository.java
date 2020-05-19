package com.example.BeautySalon.repository;

import com.example.BeautySalon.model.Master;
import com.example.BeautySalon.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Service get(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM services WHERE service_id=?",
                new BeanPropertyRowMapper<>(Service.class), id);
    }

    public List<Master> getMastersByService(long id) {
        return jdbcTemplate.query("SELECT * FROM masters WHERE master_id in " +
                        "(SELECT master_id FROM specialization WHERE service_id=?)",
                new BeanPropertyRowMapper<>(Master.class), id);
    }

    public int putPrice(long serviceId, int price) {
        return jdbcTemplate.update("UPDATE services SET price=? WHERE master_id=?", price, serviceId);
    }
}
