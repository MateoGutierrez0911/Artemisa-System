package com.artemisa.Proyecto.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class Productos {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idProducto;
    @Column
    private String codProducto;
    @Column
    private String nombreProducto;
    @Column
    private int stockProducto;
    @Column
    private String genero;
    @Column
    private String estadoProducto;
    @Column
    private Date created_at;
    @Column
    private Date updated_at;
    @ManyToOne
    @JoinColumn(
            name = "idCategoriaProducto",
            referencedColumnName = "idCategoriaProducto"
    )
    private Categorias categoriaProducto;

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodProducto() {
        return this.codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStockProducto() {
        return this.stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoProducto() {
        return this.estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Categorias getCategoriaProducto() {
        return this.categoriaProducto;
    }

    public void setCategoriaProducto(Categorias categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public Productos() {
    }

    public Productos(int idProducto, String codProducto, String nombreProducto, int stockProducto, String genero, String estadoProducto, Date created_at, Date updated_at, Categorias categoriaProducto) {
        this.idProducto = idProducto;
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.stockProducto = stockProducto;
        this.genero = genero;
        this.estadoProducto = estadoProducto;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.categoriaProducto = categoriaProducto;
    }
}
