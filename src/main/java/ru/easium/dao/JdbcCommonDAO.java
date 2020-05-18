package ru.easium.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class JdbcCommonDAO {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSourse(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public int insertCourse(String name, int duration){
        return jdbcTemplate.update("INSERT INTO courses(`name`, `duration`) VALUES (?,?)", name, duration);
    }
    public List<Map<String,Object>> getAllCourse(){
        return jdbcTemplate.queryForList("SELECT * FROM courses");
    }
}
