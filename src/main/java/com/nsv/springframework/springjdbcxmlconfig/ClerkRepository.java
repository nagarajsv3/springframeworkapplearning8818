package com.nsv.springframework.springjdbcxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClerkRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int createClerk(Clerk clerk){
        String sql="insert into clerk(ssn,name,joinedDate,terminationDate,active) values(?,?,?,?,?)";
        int updatedRows = jdbcTemplate.update(sql, new Object[]{clerk.getSsn(), clerk.getName(), clerk.getJoinedDate(),
                clerk.getTerminationDate(), clerk.isActive()});
        return updatedRows;
    }

    public Clerk readClerk(String ssn){
        String sql="select * from clerk where ssn=?";
        Clerk clerk = jdbcTemplate.queryForObject(sql, new Object[]{ssn},new ClerkRowMapper());
        return clerk;
    }

    public List<Clerk> readAllClerk(){
        String sql="select * from clerk";
        List<Clerk> allClerks = jdbcTemplate.query(sql, new ClerkRowMapper());
        return allClerks;
    }

    public void updateClerk(String name, String ssn){
        String sql="update clerk set name=? where ssn=?";
        jdbcTemplate.update(sql,new Object[]{name,ssn});
    }

    public void deleteClerk(String ssn){
        String sql="delete from clerk where ssn=?";
        jdbcTemplate.update(sql,new Object[]{ssn});
    }

}
