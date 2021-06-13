package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.BraidedWire;
import gc.borets.kkz.cable.model.LeadCoatedWire;
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
public interface BraidedWireRepository extends JpaRepository<BraidedWire, String> {

    @Query("select b.leadCoatedWire from BraidedWire b where b.trackId =:id")
    LeadCoatedWire getLeadCoatedByBraidedId(@Param("id") String id);

    @Query("select b from BraidedWire b where b.leadCoatedWire.trackId =:id")
    List<BraidedWire> findBraidedWireByLeadCoated(@Param("id") String id);

    List<BraidedWire> findAllByCableCrossSection(Integer value);

    List<BraidedWire> findAllByDateBraided(LocalDate date);

    List<BraidedWire> findAllByDateBraidedAfter(LocalDate date);

    List<BraidedWire> findAllByDateBraidedBefore(LocalDate date);

    List<BraidedWire> findAllByDateBraidedBetween(LocalDate from, LocalDate to);

    //занятые в оплетке
    @Query("select b.leadCoatedWire from BraidedWire b")
    List<LeadCoatedWire> findLeadCoatedWireInBraidedWire();

    //свободные
    @Query("select b from BraidedWire b where b.trackId not in :set")
    List<BraidedWire> findAllByTrackIdNotIn(@Param("set") Set<String> set);
}
