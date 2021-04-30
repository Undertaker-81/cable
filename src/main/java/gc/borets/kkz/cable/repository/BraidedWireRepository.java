package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.BraidedWire;
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
public interface BraidedWireRepository extends JpaRepository<BraidedWire, Long> {

   // @Query("select b from BraidedWire b join fetch b.armoredWire")
   // List<BraidedWire> getAllByArmoredWire(@Param("id") String id);
}
