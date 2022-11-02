package com.artemisa.Proyecto.repository;

import com.artemisa.Proyecto.entity.Tipo_doc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipo_docRepository extends JpaRepository<Tipo_doc, Integer> {
}
