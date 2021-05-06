package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.Wire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
public interface WireRepository extends JpaRepository<Wire, Long> {

    Wire getWireByNumberCoilSupplier(int numberCoilSupplier);

    List<Wire> findAllByDiameter(double diameter);

    List<Wire> findAllByNomenclatureId(int nom);

    @Query("select w from Wire w where w.id not in :set")
    List<Wire> findAllIsNotBusy(@Param("set") Set<Long> set);
}
