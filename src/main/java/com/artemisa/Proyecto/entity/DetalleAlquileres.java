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
@Table(name = "detallealquiler")
@Getter
@Setter
public class DetalleAlquileres {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int iddetalle_Alquiler;
    @Column
    private int valorAlquiler;
    @Column
    private int iva;
    @Column
    private Date created_at;
    @Column
    private Date updated_at;
    @ManyToOne
    @JoinColumn(
            name = "idAlquiler",
            referencedColumnName = "idAlquiler"
    )
    private Alquileres alquiler;
    @ManyToOne
    @JoinColumn(
            name = "idProducto",
            referencedColumnName = "idProducto"
    )
    private Productos producto;

    public int getIddetalle_Alquiler() {
        return this.iddetalle_Alquiler;
    }

    public void setIddetalle_Alquiler(int iddetalle_Alquiler) {
        this.iddetalle_Alquiler = iddetalle_Alquiler;
    }

    public int getValorAlquiler() {
        return this.valorAlquiler;
    }

    public void setValorAlquiler(int valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
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

    public Alquileres getAlquiler() {
        return this.alquiler;
    }

    public void setAlquiler(Alquileres alquiler) {
        this.alquiler = alquiler;
    }

    public Productos getProducto() {
        return this.producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public DetalleAlquileres() {
    }

    public DetalleAlquileres(int iddetalle_Alquiler, int valorAlquiler, int iva, Date created_at, Date updated_at, Alquileres alquiler, Productos producto) {
        this.iddetalle_Alquiler = iddetalle_Alquiler;
        this.valorAlquiler = valorAlquiler;
        this.iva = iva;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.alquiler = alquiler;
        this.producto = producto;
    }
}
