package com.bracso.demo.transaction.db1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bracso.demo.transaction.entities.Product;

/**
 *
 * @author oburgosm
 */
public interface ProductRepository1 extends JpaRepository<Product, Long> {
    
}
