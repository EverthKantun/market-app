package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="compra_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;


    private Integer cantidad;
    private Double total;
    private Boolean estado;

    //saber todos los productos que hay en una compra

    //unir la tabla compra
    @ManyToOne
    //la unión
    @JoinColumn(name="id_compra", insertable=false, updatable=false)
    private Compra compra;
    //unir la tabla producto
    @ManyToOne
    //la unión
    @JoinColumn(name="id_producto", insertable=false, updatable=false)
    private Producto producto;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


}
