package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.ArmoredWire;
import gc.borets.kkz.cable.model.BraidedWire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 30.03.2021
 */
public interface ArmoredWireRepository extends JpaRepository<ArmoredWire, Long> {

    @Query("select a.braidedWires from ArmoredWire a where a.trackId =:id")
    List<BraidedWire> findAllBraided(@Param("id") String id);
}
