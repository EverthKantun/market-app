package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //Query methods
    //obtener una lista de productos filtrados por id de categoria ordenados alfabeticamente por nombre
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    //Obtener los productos escasos
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado (int cantidad, boolean estado);

}
