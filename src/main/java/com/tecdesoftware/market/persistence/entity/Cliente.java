package com.tecdesoftware.market.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Id
    //no usamos generatedValue porque no lo vamos a generar automático, será la CURP
    private Integer id;
    private String nombre;
    private String apellidos;

    private Long celular;
    private String direccion;
    @Column(name="correo_electronico")
    private String correoElectronico;


}
