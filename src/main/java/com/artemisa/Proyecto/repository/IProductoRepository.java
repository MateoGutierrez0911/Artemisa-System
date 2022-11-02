package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Productos, Integer> {
}
