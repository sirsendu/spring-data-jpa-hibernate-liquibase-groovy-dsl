package com.cc.liquibase.demo.core.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cc.liquibase.demo.core.entity.Domain;

@Transactional(readOnly = true)
public interface DomainService {

    public Domain find(Long id);

    public List findAll();

    @Transactional
    public Domain save(Domain domain);
}