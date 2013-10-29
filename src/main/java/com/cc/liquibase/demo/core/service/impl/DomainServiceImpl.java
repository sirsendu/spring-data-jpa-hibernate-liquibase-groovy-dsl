package com.cc.liquibase.demo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.liquibase.demo.core.entity.Domain;
import com.cc.liquibase.demo.core.repository.DomainRepository;
import com.cc.liquibase.demo.core.service.DomainService;

@Service(value = "domainService")
public class DomainServiceImpl implements DomainService {

    private final DomainRepository domainRepository;

    @Autowired
    public DomainServiceImpl(final DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    @Override
    public Domain find(final Long id) {
        return this.domainRepository.findOne(id);
    }

    @Override
    public List<Domain> findAll() {
        return (List<Domain>) this.domainRepository.findAll();
    }

    @Override
    public Domain save(final Domain domain) {
        return this.domainRepository.save(domain);
    }
}