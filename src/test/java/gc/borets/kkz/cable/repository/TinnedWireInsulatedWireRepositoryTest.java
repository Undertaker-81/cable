package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.service.InsulatedService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Panfilov Dmitriy
 * 06.05.2021
 */
@SpringBootTest
@Transactional(readOnly = true)
class TinnedWireInsulatedWireRepositoryTest {

    @Autowired
    private TinnedWireInsulatedWireRepository repository;

    @Autowired
    private InsulatedService service;

    @Autowired
    private TinnedWireRepository tinnedWireRepository;
    @Autowired
    private InsulatedWireRepository insulatedWireRepository;

    @Test
    void findAllByInsulatedWireTrackId() {
        List<TinnedWireInsulatedWire> tinnedWireList = repository.findAllByInsulatedWireTrackId("и-27233");
        tinnedWireList.forEach(System.out::println);
    }

    @Test
    void findTinnedByInsulated(){
        List<TinnedWire> tinnedWires = service.findTinnedWireByInsulated("и-27233");
        tinnedWires.forEach(System.out::println);
    }

    @Test
    void findAllByTinnedWireTrackId(){
        List<TinnedWireInsulatedWire> tinnedWireList = repository.findAllByTinnedWire("Л-22508");
        tinnedWireList.forEach(System.out::println);
    }

    @Test
    void findAllTinnedInInsulatedWire(){
        Set<TinnedWire> tinnedWires = repository.findTinnedWireInInsulatedWire();
        tinnedWires.forEach(System.out::println);
    }

    @Test
    @Transactional
    void create(){
        TinnedWire tinnedWire1 = tinnedWireRepository.getOne("Л-22511");
        TinnedWire tinnedWire2 = tinnedWireRepository.getOne("Л-22509");
        InsulatedWire insulatedWire = new InsulatedWire();
        insulatedWire.setTrackId("и-152555");
        insulatedWire.setName("new Insulated");
        insulatedWire.setLength(7000);
        insulatedWire.setNomenclatureId(555);
        insulatedWire.setDateInsulated(LocalDate.of(2021,5,2));
        insulatedWireRepository.saveAndFlush(insulatedWire);

        TinnedWireInsulatedWire tinnedWireInsulatedWire1 = new TinnedWireInsulatedWire();
        InsulatedWire newInsulated = insulatedWireRepository.getOne("и-152555");
        tinnedWireInsulatedWire1.setInsulatedWire(newInsulated);
        tinnedWireInsulatedWire1.setLengthTinned(4000);
        tinnedWireInsulatedWire1.setTinnedWire(tinnedWire1);


        TinnedWireInsulatedWire tinnedWireInsulatedWire2 = new TinnedWireInsulatedWire();
        tinnedWireInsulatedWire2.setInsulatedWire(newInsulated);
        tinnedWireInsulatedWire2.setLengthTinned(3000);
        tinnedWireInsulatedWire2.setTinnedWire(tinnedWire2);
        repository.saveAll(List.of(tinnedWireInsulatedWire1, tinnedWireInsulatedWire2));
        repository.findAll().forEach(System.out::println);

        System.out.println(insulatedWireRepository.getOne("и-152555"));
        System.out.println(insulatedWireRepository.getOne("и-27231"));
    }

}