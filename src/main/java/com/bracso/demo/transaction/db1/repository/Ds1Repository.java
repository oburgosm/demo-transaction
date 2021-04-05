package com.bracso.demo.transaction.db1.repository;

import com.bracso.demo.transaction.db1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author oburgosm
 */
public interface Ds1Repository extends JpaRepository<Long, Product> {
    
}
