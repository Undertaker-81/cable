package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



/**
 * @author Panfilov Dmitriy
 * 06.05.2021
 */
@Transactional(readOnly = true)
public interface TinnedWireInsulatedWireRepository extends JpaRepository<TinnedWireInsulatedWire, Long> {

    @Query("select i from TinnedWireInsulatedWire i where i.insulatedWire.trackId =:id")
    List<TinnedWireInsulatedWire> findAllByInsulatedWireTrackId(@Param("id") String id);

    @Query("select i from TinnedWireInsulatedWire i where i.tinnedWire.trackId =:id")
    List<TinnedWireInsulatedWire> findAllByTinnedWire(@Param("id") String id);

}
