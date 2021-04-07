package com.bracso.demo.transaction.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bracso.demo.transaction.entities.Product;


/**
 *
 * @author oburgosm
 */
public interface ProductRepository2 extends JpaRepository<Product, Long> {

}
