package com.cc.liquibase.demo.core.repository;

import com.cc.liquibase.demo.core.base.BaseTest;
import com.cc.liquibase.demo.core.entity.Domain;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql({"classpath:init.sql"})
@Sql(scripts = "classpath:clean.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class DomainRepositoryTest extends BaseTest {

    @Autowired
    private DomainRepository domainRepository;

    @Test
    public void shouldFindAll() {
        List<Domain> allEntities = (List<Domain>) domainRepository.findAll();
        Assert.assertNotNull(allEntities);
        Assert.assertFalse(allEntities.isEmpty());
    }
}
