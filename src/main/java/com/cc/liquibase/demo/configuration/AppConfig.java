package com.cc.liquibase.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;

@Configuration
@ComponentScan({"com.cc.liquibase.demo"})
@EnableJpaRepositories("com.cc.liquibase.demo.core.repository")
@Import({RepositoryConfig.class})
public class AppConfig {

    @Bean
    public JpaTransactionManager transactionManager() {
        return new JpaTransactionManager();
    }
}
