package com.cc.liquibase.demo.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.cc.liquibase.demo.core.entity.Domain;

public interface DomainRepository extends CrudRepository<Domain, Long> {
}