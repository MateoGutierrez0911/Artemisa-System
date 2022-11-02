package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.TipoVentaAlquileres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoVentaAlquilerRepository extends JpaRepository<TipoVentaAlquileres, Integer> {
}
