package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.Wire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
public interface WireRepository extends JpaRepository<Wire, Long> {

    Wire getWireByNumberCoilSupplier(int numberCoilSupplier);

    List<Wire> findAllByDiameter(double diameter);

    List<Wire> findAllByNomenclatureId(int nom);


}
