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
@Table(name = "alquiler")
@Getter
@Setter
public class Alquileres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAlquiler;
    @Column
    private Date fechaAlquiler;
    @Column
    private int valorTotal;
    @Column
    private Date created_at;
    @Column
    private Date updated_at;
    @ManyToOne
    @JoinColumn(
            name = "idUsuario",
            referencedColumnName = "idUsuario"
    )
    private Usuarios usuario;

    public int getIdAlquiler() {
        return this.idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Date getFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
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

    public Usuarios getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Alquileres() {
    }

    public Alquileres(int idAlquiler, Date fechaAlquiler, int valorTotal, Date created_at, Date updated_at, Usuarios usuario) {
        this.idAlquiler = idAlquiler;
        this.fechaAlquiler = fechaAlquiler;
        this.valorTotal = valorTotal;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.usuario = usuario;
    }
}
