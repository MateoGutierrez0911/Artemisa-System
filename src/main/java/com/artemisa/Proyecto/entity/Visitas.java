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
@Table(name = "visitas")
@Getter
@Setter
public class Visitas {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idVisita;
    @Column
    private Date fechaVisita;
    @Column
    private String estadoVisita;
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
    @ManyToOne
    @JoinColumn(
            name = "idProducto",
            referencedColumnName = "idProducto"
    )
    private Productos producto;
    @ManyToOne
    @JoinColumn(
            name = "idTipoVentaAlquiler",
            referencedColumnName = "idTipoVentaAlquiler"
    )
    private TipoVentaAlquileres tipoVentaAlquiler;

    public int getIdVisita() {
        return this.idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Date getFechaVisita() {
        return this.fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getEstadoVisita() {
        return this.estadoVisita;
    }

    public void setEstadoVisita(String estadoVisita) {
        this.estadoVisita = estadoVisita;
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

    public Productos getProducto() {
        return this.producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public TipoVentaAlquileres getTipoVentaAlquiler() {
        return this.tipoVentaAlquiler;
    }

    public void setTipoVentaAlquiler(TipoVentaAlquileres tipoVentaAlquiler) {
        this.tipoVentaAlquiler = tipoVentaAlquiler;
    }

    public Visitas() {
    }

    public Visitas(int idVisita, Date fechaVisita, String estadoVisita, Date created_at, Date updated_at, Usuarios usuario, Productos producto, TipoVentaAlquileres tipoVentaAlquiler) {
        this.idVisita = idVisita;
        this.fechaVisita = fechaVisita;
        this.estadoVisita = estadoVisita;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.usuario = usuario;
        this.producto = producto;
        this.tipoVentaAlquiler = tipoVentaAlquiler;
    }
}
