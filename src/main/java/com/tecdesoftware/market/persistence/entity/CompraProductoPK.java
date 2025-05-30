package com.tecdesoftware.market.persistence.entity;
//para unir las dos llaves y crear una llave compuesta

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
//serializable es para que sea autoincrementable
public class CompraProductoPK implements Serializable {
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Column(name = "id_compra")
    private int idCompra;

    @Column(name="id_producto")
    private int idProducto;

}
