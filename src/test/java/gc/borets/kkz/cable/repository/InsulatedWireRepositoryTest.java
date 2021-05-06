package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.TinnedWire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

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
class InsulatedWireRepositoryTest {

    @Autowired
    private InsulatedWireRepository repository;

    @Autowired
    private LeadCoatedWireRepository leadCoatedWireRepository;
/*
    @Test
    void findAllByTinnedWires() {
        List<InsulatedWire> insulatedWires = repository.findAllByTinnedWires("Л-22508");
        insulatedWires.forEach(System.out::println);
    }

    @Test
    void findTinnedWireByInsulatedId() {
        List<TinnedWire> tinnedWires = repository.findTinnedWireByInsulatedId("и-27233");
        tinnedWires.forEach(System.out::println);
    }
 */
    @Test
    void findInsulatedWireIsNotBusy(){
        Set<String> setBusyWire = leadCoatedWireRepository
                                        .findInsulatedInLeadCoatedWireUse()
                                        .stream()
                                        .map(InsulatedWire::getTrackId)
                                        .collect(Collectors.toSet());
        List<InsulatedWire> freedomWire = repository.findTinnedWireIsNotBusy(setBusyWire);
        freedomWire.forEach(System.out::println);
    }

}