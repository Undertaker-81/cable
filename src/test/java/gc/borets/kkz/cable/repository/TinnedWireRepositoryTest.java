package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.Wire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Panfilov Dmitriy
 * 04.05.2021
 */
@SpringBootTest
@Transactional(readOnly = true)
class TinnedWireRepositoryTest {

    @Autowired
    private TinnedWireRepository repository;

    @Autowired
    private TinnedWireInsulatedWireRepository tinnedWireInsulatedWireRepository;

    @Test
    void findAllByWire() {
        List<TinnedWire> tinnedWires = repository.findAllByWireNumberCoilSupplier(101103);
        tinnedWires.forEach(System.out::println);
    }

    @Test
    void findAllInsulatedByTinnedWire() {
        List<Wire> insulatedWires = repository.findWireByTinnedWire("Л-22508");
        insulatedWires.forEach(System.out::println);
    }

    @Test
    void findAllByDateTinned() {
        List<TinnedWire> tinnedWires = repository.findAllByDateTinned(LocalDate.of(2021, 1, 1));
        tinnedWires.forEach(System.out::println);
    }

    @Test
    void findAllNotBusy(){
        Set<String> setUsed = tinnedWireInsulatedWireRepository
                                                            .findTinnedWireInInsulatedWire()
                                                            .stream()
                                                            .map(TinnedWire::getTrackId)
                                                            .collect(Collectors.toSet());
        List<TinnedWire> tinnedWires = repository.findAllIsNotBusy(setUsed);
        tinnedWires.forEach(System.out::println);
    }

}