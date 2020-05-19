package com.example.BeautySalon.repository;

import com.example.BeautySalon.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RecordRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Record get(long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM records WHERE record_id=?",
                new BeanPropertyRowMapper<>(Record.class), id);
    }

    public int post(Record record) {
        return jdbcTemplate.update("INSERT INTO records (client_id, service_id, date_time) VALUES (?,?,?)",
                record.getClientId(), record.getServiceId(), record.getDateTime());
    }

    public int delete(long recordId) {
        return jdbcTemplate.update("DELETE FROM records WHERE record_id=?", recordId);
    }

}
