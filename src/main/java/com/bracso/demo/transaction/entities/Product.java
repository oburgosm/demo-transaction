package com.bracso.demo.transaction.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author oburgosm
 */
@Entity
public class Product {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(unique=true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
