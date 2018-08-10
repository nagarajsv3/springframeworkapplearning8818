package com.nsv.springframework.springjdbcjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.nsv.springframework.springjdbcjavaconfig"})
@PropertySources({
        @PropertySource("app.properties"),
        @PropertySource("connection.properties")
})
public class JavaConfig {

    @Autowired
    public Environment environment;

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
