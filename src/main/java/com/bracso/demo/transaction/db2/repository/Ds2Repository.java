package com.bracso.demo.transaction.db2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bracso.demo.transaction.db2.entity.Product;


/**
 *
 * @author oburgosm
 */
public interface Ds2Repository extends JpaRepository<Product, Long> {

}
