package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.LeadCoatedWire;
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
public interface LeadCoatedWireRepository extends JpaRepository<LeadCoatedWire, Long> {

    @Query("select l.insulatedWire from LeadCoatedWire l where l.trackId =:id")
    InsulatedWire getInsulatedByLeadCoatedId(@Param("id") String id);

    @Query("select l from LeadCoatedWire l where l.insulatedWire.trackId =:id")
    List<LeadCoatedWire> getAllByInsulated(@Param("id") String id);
}
