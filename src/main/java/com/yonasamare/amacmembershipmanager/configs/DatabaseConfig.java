package com.yonasamare.amacmembershipmanager.configs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class DatabaseConfig {
/*    @Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource localDB() {
        final DriverManagerDataSource local = new DriverManagerDataSource();
        local.setUrl(jdbcUrl);
        local.setUsername(username);
        local.setPassword(password);

        return local;
    }*/
}
