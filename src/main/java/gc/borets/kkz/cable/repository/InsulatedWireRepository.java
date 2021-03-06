package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.TinnedWire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
@Transactional(readOnly = true)
public interface InsulatedWireRepository extends JpaRepository<InsulatedWire, String> {
/*
    @Query("select i from InsulatedWire i join fetch i.tinnedWires t where t.trackId =:id")
    List<InsulatedWire> findAllByTinnedWires(@Param("id") String id);

    @Query("select i.tinnedWires from InsulatedWire i where i.trackId =:id")
    List<TinnedWire> findTinnedWireByInsulatedId(@Param("id") String id);

 */

    List<InsulatedWire> findAllByDateInsulated(LocalDate date);

    List<InsulatedWire> findAllByDateInsulatedAfter(LocalDate date);

    List<InsulatedWire> findAllByDateInsulatedBefore(LocalDate date);

    List<InsulatedWire> findAllByDateInsulatedBetween(LocalDate from, LocalDate to);

    List<InsulatedWire> findAllByCableCrossSection(Integer value);

    @Query("select i from InsulatedWire i where i.trackId not in :set")
    List<InsulatedWire> findTinnedWireIsNotBusy(@Param("set") Set<String> set);

}
