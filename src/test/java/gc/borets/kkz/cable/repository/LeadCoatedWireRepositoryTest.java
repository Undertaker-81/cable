package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.LeadCoatedWire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.SecondaryTable;
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
class LeadCoatedWireRepositoryTest {
    @Autowired
    private LeadCoatedWireRepository leadCoatedWireRepository;

    @Autowired
    private BraidedWireRepository braidedWireRepository;

    @Test
    void getInsulatedByLeadCoatedId() {
        InsulatedWire getInsulated = leadCoatedWireRepository.getInsulatedByLeadCoatedId("с-77402");
        System.out.println(getInsulated);
    }

    @Test
    void getAllByInsulated() {
        List<LeadCoatedWire> leadCoatedWires = leadCoatedWireRepository.getAllByInsulated("и-27233");
        leadCoatedWires.forEach(System.out::println);
    }
    @Test
    void findInsulatedIsBusy(){
        Set<InsulatedWire> insulatedWires = leadCoatedWireRepository.findInsulatedInLeadCoatedWireUse();
        insulatedWires.forEach(System.out::println);
    }
    @Test
    void findLeadCoatedIsNotBusy(){
        Set<String> leadCoatedWires = braidedWireRepository
                                                .findLeadCoatedWireInBraidedWire()
                                                .stream()
                                                .map(LeadCoatedWire::getTrackId)
                                                .collect(Collectors.toSet());
        List<LeadCoatedWire> findNotBusy = leadCoatedWireRepository.findLeadCoatedWireIsNotBusy(leadCoatedWires);
        findNotBusy.forEach(System.out::println);
    }
}