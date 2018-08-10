package com.nsv.springframework.springjdbcjavaconfigduplicateforpractise;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClerkRowMapper implements RowMapper<Clerk> {
    @Override
    public Clerk mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Clerk(resultSet.getString("ssn"),resultSet.getString("name"),resultSet.getDate("joinedDate"),resultSet.getDate("terminationDate"),resultSet.getBoolean("active"));
    }
}
