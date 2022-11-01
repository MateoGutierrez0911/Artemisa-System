package com.artemisa.Proyecto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
@Getter
@Setter
public class Categorias {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idCategoriaProducto;
    @Column(
            name = "categoriaProducto"
    )
    private String categoriaProducto;

    public int getIdCategoriaProducto() {
        return this.idCategoriaProducto;
    }

    public void setIdCategoriaProducto(int idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }

    public String getCategoriaProducto() {
        return this.categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Categorias() {
    }

    public Categorias(int idCategoriaProducto, String categoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
        this.categoriaProducto = categoriaProducto;
    }
}
