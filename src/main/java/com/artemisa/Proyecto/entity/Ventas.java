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
@Table(name = "ventas")
@Getter
@Setter
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private int idVenta;
    @Column(nullable = false)
    private Date fechaVenta;
    @Column(nullable = false)
    private int valorTotal;
    @Column(nullable = false)
    private Date created_at;
    @Column(nullable = false)
    private Date updated_at;
    @ManyToOne
    @JoinColumn(
            name = "idUsuario", nullable = false
    )
    private Usuarios usuario;

    public int getIdVenta() {
        return this.idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
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

    public Ventas() {
    }

    public Ventas(int idVenta, Date fechaVenta, int valorTotal, Date created_at, Date updated_at, Usuarios usuario) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.valorTotal = valorTotal;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.usuario = usuario;
    }
}
