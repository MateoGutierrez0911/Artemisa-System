package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.Visitas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVisitasRepository extends JpaRepository<Visitas, Integer> {
}
