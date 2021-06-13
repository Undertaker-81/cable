package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.ArmoredWire;
import gc.borets.kkz.cable.model.BraidedWire;
import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.LeadCoatedWire;
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
 * 29.04.2021
 */
@SpringBootTest
@Transactional(readOnly = true)
class BraidedWireRepositoryTest {

    @Autowired
    private BraidedWireRepository repository;

    @Autowired
    private ArmoredWireRepository armoredWireRepository;

    @Test
    public  void test (){
        List<BraidedWire> cable = repository.findAll();
        cable.forEach(System.out::println);
    }

    @Test
    public void getAllBraidedByArmored(){
        List<BraidedWire> cable = armoredWireRepository.findAllBraided("б-29230");
       // System.out.println(cable);
        cable.forEach(System.out::println);
    }

    @Test
    public void getLeadCoatedByBraidedId(){
        LeadCoatedWire coatedWires = repository.getLeadCoatedByBraidedId("о-118022");
        System.out.println(coatedWires);
    }


    @Test
    public void findAllBraidedByCoatedLeadIn(){
        List<BraidedWire> braidedWires = repository.findBraidedWireByLeadCoated("с-77402");
        braidedWires.forEach(System.out::println);
    }
    @Test
    public void findAllArmoredByBraided(){
        List<ArmoredWire> armoredWires = armoredWireRepository.findAllByBraidedWires("о-118022");
        armoredWires.forEach(System.out::println);
    }

    @Test
    public void findLeadCoatedWireIsBusy(){
        List<LeadCoatedWire> leadCoatedWires = repository.findLeadCoatedWireInBraidedWire();
        leadCoatedWires.forEach(System.out::println);
    }
    @Test
    public void findBraidedWireIsNotBusy(){
        Set<String> braidedId = armoredWireRepository
                                    .findBraidedWireInArmored()
                                    .stream()
                                    .map(BraidedWire::getTrackId)
                                    .collect(Collectors.toSet());

        List<BraidedWire> findBraidedWireIsNotBusy = repository.findAllByTrackIdNotIn(braidedId);
        findBraidedWireIsNotBusy.forEach(System.out::println);
    }

}