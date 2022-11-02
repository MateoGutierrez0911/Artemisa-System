package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer> {
}
