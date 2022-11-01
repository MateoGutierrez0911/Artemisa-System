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
@Table(name = "tipo_doc")
@Getter
@Setter
public class Tipo_doc {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idDoc;
    @Column
    private String tipoDoc;

    public int getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getTipoDoc() {
        return this.tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Tipo_doc() {
    }

    public Tipo_doc(int idDoc, String tipoDoc) {
        this.idDoc = idDoc;
        this.tipoDoc = tipoDoc;
    }
}
