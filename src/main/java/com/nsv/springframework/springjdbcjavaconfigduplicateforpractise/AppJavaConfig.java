package com.nsv.springframework.springjdbcjavaconfigduplicateforpractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.nsv.springframework.springjdbcjavaconfigduplicateforpractise"})
@PropertySources(value = {
        @PropertySource(value = "app.properties"),
        @PropertySource(value = "connection.properties")
})

public class AppJavaConfig {

    @Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }

    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(
                environment.getProperty("datasource.url"),
                environment.getProperty("datasource.username"),
                environment.getProperty("datasource.userpassword"));
        return dataSource;
    }

}
