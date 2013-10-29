package com.cc.liquibase.demo.core.entity;


import org.junit.Assert;
import org.junit.Test;

import com.cc.liquibase.demo.core.entity.Domain;

import java.time.LocalDateTime;

public class DomainTest {

    @Test
    public void shouldGettersAndSettersWork() {
        Long id = 123L;
        String text = "Ann";
        LocalDateTime created = LocalDateTime.of(1999, 11, 1, 12, 5);
        Domain domain = new Domain();
        domain.setId(id);
        domain.setText(text);
        domain.setCreated(created);
        Assert.assertNotNull(domain);
        Assert.assertEquals(id, domain.getId());
    }
}
