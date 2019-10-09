package com.marcosbarbero.lab.sec.oauth.jwt.config.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {

    @Bean("oauthDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.security")
    public DataSource oauthDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean("relationalDataSource")
    @ConfigurationProperties(prefix="spring.datasource.relational")
    public DataSource relationalDataSource() {
        return DataSourceBuilder.create().build();
    }


}
