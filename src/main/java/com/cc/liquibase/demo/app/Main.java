package com.cc.liquibase.demo.app;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cc.liquibase.demo.configuration.AppConfig;
import com.cc.liquibase.demo.core.entity.Domain;
import com.cc.liquibase.demo.core.service.DomainService;

public class Main {

    public static void main(final String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        final DomainService service = (DomainService) ctx.getBean("domainService");

        final Domain s1 = new Domain();
        s1.setText("t1");
        s1.setId(10L);
        s1.setCreated(LocalDateTime.now());
        service.save(s1);
        final List<Domain> entities = service.findAll();
        final Domain s2 = entities.get(0);
        System.out.println(s1.getId());
        System.out.println(s2.getId() + " " + s2.getText() + " " + s2.getCreated());
    }
}
