package repository;

import com.artemisa.Proyecto.entity.Alquileres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlquilerRepository extends JpaRepository<Alquileres, Integer> {

}
