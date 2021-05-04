package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.TinnedWire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
@Transactional(readOnly = true)
public interface InsulatedWireRepository extends JpaRepository<InsulatedWire, Long> {

    @Query("select i from InsulatedWire i join fetch i.tinnedWires t where t.trackId =:id")
    List<InsulatedWire> findAllByTinnedWires(@Param("id") String id);

    @Query("select i.tinnedWires from InsulatedWire i where i.trackId =:id")
    List<TinnedWire> findTinnedWireByInsulatedId(@Param("id") String id);

}
