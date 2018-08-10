package com.nsv.springframework.springjdbcxmlconfigduplicateforpractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClerkRepositoy {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createClerk(Clerk clerk){
        String sql="insert into clerk(ssn,name,joinedDate,terminationDate,active) values(?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, new Object[]{clerk.getSsn(), clerk.getName(), clerk.getJoinedDate(), clerk.getTerminationDate(), clerk.isActive()});
        return update;
    }

    public Clerk readClerk(String ssn){
        String sql="select * from clerk where ssn=?";
        Clerk clerk = jdbcTemplate.queryForObject(sql, new Object[]{ssn},new ClerkRowMapper());
        return clerk;
    }

    public List<Clerk> readAllClerk(){
        String sql="select * from clerk";
        List<Clerk> clerks = jdbcTemplate.query(sql, new ClerkRowMapper());
        return clerks;
    }

    public void updateClerk(String name, String ssn){
        String sql="update clerk set name=? where ssn=?";
        jdbcTemplate.update(sql,new Object[]{name,ssn});
    }

    public void deleteClerk(String ssn){

        String sql="delete from clerk where ssn=?";
        jdbcTemplate.update(sql,new Object[]{ssn});
    }

    public void deleteAll(){
        String sql="delete from clerk";
        jdbcTemplate.update(sql);
    }
}
