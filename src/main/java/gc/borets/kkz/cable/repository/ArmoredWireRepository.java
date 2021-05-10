package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.ArmoredWire;
import gc.borets.kkz.cable.model.BraidedWire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
public interface ArmoredWireRepository extends JpaRepository<ArmoredWire, String> {

    @Query("select a.braidedWires from ArmoredWire a where a.trackId =:id")
    List<BraidedWire> findAllBraided(@Param("id") String id);

    @Query("select a from ArmoredWire a join fetch a.braidedWires b  where b.trackId =:id")
    List<ArmoredWire> findAllByBraidedWires(@Param("id") String id);

    List<ArmoredWire> findAllByCableCrossSection(Integer value);

    List<ArmoredWire> findAllByDateArmored(LocalDate date);

    List<ArmoredWire> findAllByDateArmoredAfter(LocalDate date);

    List<ArmoredWire> findAllByDateArmoredBefore(LocalDate date);

    List<ArmoredWire> findAllByDateArmoredBetween(LocalDate from, LocalDate to);

    //занятые в броне
    @Query("select a.braidedWires from ArmoredWire a")
    Set<BraidedWire> findBraidedWireInArmored();
}
