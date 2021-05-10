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
    private WireRepository wireRepository;

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
    @Test
    @Transactional
    void create(){
        Wire wire = wireRepository.getOne(5L);
        TinnedWire tinnedWire = new TinnedWire();
        tinnedWire.setTrackId("Л-22505");
        tinnedWire.setDateTinned(LocalDate.of(2021,5, 2));
        tinnedWire.setName("Проволока медная луженая ММЛ 4,5 ТУ16.К71-362-2006");
        tinnedWire.setDiameter(4.5);
        tinnedWire.setLength(7000);
        tinnedWire.setNomenclatureId(186925);
        tinnedWire.setWeight(1200);
        tinnedWire.setWire(wire);
        repository.saveAndFlush(tinnedWire);
        System.out.println(repository.getOne("Л-22505"));
    }

}