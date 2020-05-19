package com.example.BeautySalon.repository;

import com.example.BeautySalon.model.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MasterRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Master get(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM masters WHERE master_id=?",
                new BeanPropertyRowMapper<>(Master.class), id);
    }

    public int post(Master master) {
        return jdbcTemplate.update("INSERT INTO masters (name,surname,phone,salary) VALUES (?,?,?,?)",
                master.getName(), master.getSurname(), master.getPhone(), master.getSalary());
    }

    public int putPhone(long masterId, String phone) {
        return jdbcTemplate.update("UPDATE masters SET phone=? WHERE master_id=?", phone, masterId);
    }

    public int putSalary(long masterId, int salary) {
        return jdbcTemplate.update("UPDATE masters SET salary=? WHERE master_id=?", salary, masterId);
    }

    public int delete(long masterId) {
        return jdbcTemplate.update("DELETE FROM masters WHERE master_id=?", masterId);
    }
}
