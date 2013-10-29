package com.cc.liquibase.demo.core.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOMAIN")
public class Domain {

    @Column(name = "code")
    private Long code;

    @Column(name = "created")
    private LocalDateTime created;

    @Id
    // @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "text")
    private String text;

    public Long getCode() {
        return this.code;
    }

    public LocalDateTime getCreated() {
        return this.created;
    }

    public Long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setCode(final Long code) {
        this.code = code;
    }

    public void setCreated(final LocalDateTime created) {
        this.created = created;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
