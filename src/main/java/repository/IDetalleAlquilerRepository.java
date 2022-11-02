package repository;

import com.artemisa.Proyecto.entity.DetalleAlquileres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleAlquilerRepository extends JpaRepository<DetalleAlquileres, Integer> {
}
