package com.nsv.springframework.javaconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.nsv.springframework.javaconfiguration"})
@PropertySources({
        @PropertySource("app.properties"),
        @PropertySource("connection.properties")
})
public class ApplicationSpringConfig {

    @Autowired
    public Environment environment;

    @Bean("circle")
    @Scope("singleton")
    public Circle getCircle() {
        return new Circle();
    }

    @Bean("rectangle")
    @Scope("prototype")
    public Rectangle getRectangle() {
        return new Rectangle();
    }

    @Bean
    public Triangle getTriangle() {
        return new Triangle();
    }

    @Bean
    public ShapeCreator getShapeCreator() {
        System.out.println("Read From Property File app.properties using PropertySources: " + environment.getProperty("title"));
        System.out.println("Read From Property File connection.properties using PropertySources: " + environment.getProperty("dbUserName"));
        return new ShapeCreator(getCircle());
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(environment.getProperty("datasource.url"), environment.getProperty("datasource.username"), null);
        return dataSource;
    }


}
