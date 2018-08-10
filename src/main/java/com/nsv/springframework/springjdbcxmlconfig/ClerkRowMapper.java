package com.nsv.springframework.springjdbcxmlconfig;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClerkRowMapper implements RowMapper<Clerk> {
    @Override
    public Clerk mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Clerk(resultSet.getString("name"),resultSet.getString("ssn"),resultSet.getDate("joinedDate"),resultSet.getDate("terminationDate"),resultSet.getBoolean("active"));
    }
}
