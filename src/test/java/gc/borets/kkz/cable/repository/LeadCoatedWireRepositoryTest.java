package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.LeadCoatedWire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}