package com.tecdesoftware.market.persistence;

import com.tecdesoftware.market.persistence.crud.ProductoCrudRepository;
import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//le dice a Spring que este archivo se enlaza con la DB
@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //probamos el equivalente a select * from productos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    //obtener un producto dado el Id
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //guaradar un producto
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    //Eliminar producto por id
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }


}
