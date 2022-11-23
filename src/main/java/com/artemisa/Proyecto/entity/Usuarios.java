package com.artemisa.Proyecto.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuarios")
public class Usurious implements UserDetails {

    @SequenceGenerator(
            name = "idUsuario",
            sequenceName = "idUsuario",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "idusuario")
    @Column(name = "idusuario", unique = true, nullable = false)
    private int idUsuario;


    @Column(name = "doc_usuario", nullable = false)
    private String docUsuario;

    @NotNull(message = "First Name cannot be empty")
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name = "email")
    private String emailUsuario;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "estadoUsuario")
    private String estadoUsuario;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Enumerated(EnumType.STRING)
    private Tipo_doc tipo_doc;

    @Enumerated(EnumType.STRING)
    private Rol rol;


    @Column(name = "locked")
    private Boolean locked = false;

    @Column(name = "enabled")
    private Boolean enabled = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(rol.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return contraseña;
    }

    public void setPassword(String password){
        this.contraseña = password;
    }

    @Override
    public String getUsername() {
        return emailUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getDocUsuario() {
        return docUsuario;
    }

    public void setDocUsuario(String docUsuario) {
        this.docUsuario = docUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Tipo_doc getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(Tipo_doc tipo_doc) {
        this.tipo_doc = tipo_doc;
    }
}
