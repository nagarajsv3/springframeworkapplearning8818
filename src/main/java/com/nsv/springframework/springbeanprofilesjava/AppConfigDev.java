package com.nsv.springframework.springbeanprofilesjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Component
@Profile("dev")
@PropertySources(
        {
                @PropertySource("app-dev.properties"),
                @PropertySource("connection-dev.properties")
                //@PropertySource("app-prod.properties"),
                //@PropertySource("connection-prod.properties"),

        }
)
public class AppConfigDev {

    @Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(
                environment.getProperty("datasource.url"),
                environment.getProperty("datasource.username"),
                environment.getProperty("datasource.userpassword"));
        return dataSource;
    }

}
