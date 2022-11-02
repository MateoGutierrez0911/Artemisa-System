package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentasRepository extends JpaRepository<Ventas, Integer> {
}
