package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.Wire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
@Transactional(readOnly = true)
public interface TinnedWireRepository extends JpaRepository<TinnedWire, Long> {

    @Query("select t from TinnedWire t where t.wire.numberCoilSupplier =:numberCoilSupplier")
    List<TinnedWire> findAllByWireNumberCoilSupplier(@Param("numberCoilSupplier") Integer id);

    @Query("select t.wire from TinnedWire t where t.trackId =:id")
    List<Wire> findWireByTinnedWire(@Param("id") String id);

    List<TinnedWire> findAllByDateTinned(LocalDate date);

    List<TinnedWire> findAllByDateTinnedBefore(LocalDate date);

    List<TinnedWire> findAllByDateTinnedAfter(LocalDate date);

    List<TinnedWire> findAllByDateTinnedBetween(LocalDate from, LocalDate to);

    List<TinnedWire> findAllByNomenclatureId(int nom);
}
