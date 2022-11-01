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
@Table(name = "tipoventaalquiler")
@Getter
@Setter
public class TipoVentaAlquileres {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idTipoVentaAlquiler;
    @Column
    private String descTipo;

    public int getIdTipoVentaAlquiler() {
        return this.idTipoVentaAlquiler;
    }

    public void setIdTipoVentaAlquiler(int idTipoVentaAlquiler) {
        this.idTipoVentaAlquiler = idTipoVentaAlquiler;
    }

    public String getDescTipo() {
        return this.descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }

    public TipoVentaAlquileres() {
    }

    public TipoVentaAlquileres(int idTipoVentaAlquiler, String descTipo) {
        this.idTipoVentaAlquiler = idTipoVentaAlquiler;
        this.descTipo = descTipo;
    }
}