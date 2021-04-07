package com.bracso.demo.transaction.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bracso.demo.transaction.db1.entity.Product;

/**
 *
 * @author oburgosm
 */
public interface Ds1Repository extends JpaRepository<Product, Long> {
    
}
