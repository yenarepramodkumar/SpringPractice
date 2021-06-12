package com.test.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
           Person per =new Person();
           per.setId(rs.getInt("id"));
           per.setName(rs.getString("name"));
           per.setLocation(rs.getString("location"));
           per.setBirthDate(rs.getDate("birth_date"));
            return per;
        }

    }

    public List<Person> findAll(){
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }
    public Person findById(int id){
        return jdbcTemplate.queryForObject("select * from person where id = ?", new Object[]{id},new BeanPropertyRowMapper<Person>(Person.class));
    }
    public int deleteById(int id){
        return jdbcTemplate.update("delete from person where id = ?", new Object[]{id});
    }
    public int insert(Person p){
        return jdbcTemplate.update("insert into person (id,name,location,birth_date)values(?,?,?,?)", 
        new Object[]{p.getId(),p.getName(),p.getLocation(),new Timestamp(p.getBirthDate().getTime())});
    }
    public int update(Person p){
        return jdbcTemplate.update("update person set name=?,location=?,birth_date=? where id=?", 
        new Object[]{p.getName(),p.getLocation(),new Timestamp(p.getBirthDate().getTime()),p.getId()});
    }
}
