package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //probamos el equivalente a select * from productos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
