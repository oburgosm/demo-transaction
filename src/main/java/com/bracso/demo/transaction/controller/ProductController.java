package com.bracso.demo.transaction.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bracso.demo.transaction.db1.repository.ProductRepository1;
import com.bracso.demo.transaction.db2.repository.ProductRepository2;
import com.bracso.demo.transaction.entities.Product;
import io.swagger.annotations.ApiOperation;

/**
 * @author oburgosm
 */
@Validated
@RestController
@RequestMapping(path = "/product")
public class ProductController {


    @Resource
    private ProductRepository1 productRepository1;

    @Resource
    private ProductRepository2 productRepository2;

    @Resource
    DataSource ds1XA;

    /**
     * Inserta dos productos, usando dos repositorios distintos
     *
     * Como el nombre del producto tiene una clave única, si se intenta llamar este método con el mismo
     * valor name1 que name2, debería producirse una excepción.
     * @param name1 Nombre del producto 1 a insertar
     * @param name2 Nombre del producto 2 a insertar
     * @return
     * @throws SQLException
     */
    @GetMapping("{name1}/{name2}")
    @Transactional
    @ApiOperation("Inserta dos productos, cada uno en un repositorio distinto, de forma transaccional.")
    public List<Product> insert2Products(@PathVariable String name1, @PathVariable String name2) throws SQLException {
        Product product1 = new Product();
        product1.setName(name1);
        Product product2 = new Product();
        product2.setName(name2);
        this.productRepository1.save(product1);
        this.productRepository2.save(product2);
        List<Product> result = new ArrayList<>();
        result.add(product1);
        result.add(product2);
        return result;
    }

    /**
     * Inserta dos productos en el ds1
     * @param name1
     * @param name2
     * @return
     * @throws SQLException
     */
    @GetMapping("/insert1/{name1}/{name2}")
    @Transactional
    @ApiOperation("Inserta dos productos en el ds1,de forma transaccional.")
    public List<Product> insert2ProductsInDS1(@PathVariable String name1, @PathVariable String name2)
            throws SQLException {
        Product product1 = new Product();
        product1.setName(name1);
        Product product2 = new Product();
        product2.setName(name2);
        this.productRepository1.save(product1);
        this.productRepository1.save(product2);
        List<Product> result = new ArrayList<>();
        result.add(product1);
        result.add(product2);
        return result;
    }

    /**
     * Inserta dos productos en el ds2
     * @param name1
     * @param name2
     * @return
     * @throws SQLException
     */
    @GetMapping("/insert2/{name1}/{name2}")
    @Transactional
    @ApiOperation("Inserta dos productos en el ds2,de forma transaccional.")
    public List<Product> insert2ProductsInDS2(@PathVariable String name1, @PathVariable String name2)
            throws SQLException {
        Product product1 = new Product();
        product1.setName(name1);
        Product product2 = new Product();
        product2.setName(name2);
        this.productRepository2.save(product1);
        this.productRepository2.save(product2);
        List<Product> result = new ArrayList<>();
        result.add(product1);
        result.add(product2);
        return result;
    }

    /**
     * Lista el repository1
     * @return
     */
    @GetMapping("list1")
    @ApiOperation("Lista los productos del DS1.")
    @Transactional(readOnly = true)
    public List<Product> findAll_1() {
        return this.productRepository1.findAll();
    }

    /**
     * Lista el repository2
     * @return
     */
    @GetMapping("list2")
    @ApiOperation("Lista los productos del DS2.")
    @Transactional(readOnly = true)
    public List<Product> findAll_2() {
        return this.productRepository2.findAll();
    }

}
