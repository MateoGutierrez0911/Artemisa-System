package repository;

import com.artemisa.Proyecto.entity.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriasRepository extends JpaRepository<Categorias, Integer> {
}
