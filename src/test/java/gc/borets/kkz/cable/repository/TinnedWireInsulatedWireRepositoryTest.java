package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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

    @Test
    void findAllByInsulatedWireTrackId() {
        List<TinnedWireInsulatedWire> tinnedWireList = repository.findAllByInsulatedWireTrackId("и-27233");
        tinnedWireList.forEach(System.out::println);
    }

    @Test
    void findAllByTinnedWireTrackId(){
        List<TinnedWireInsulatedWire> tinnedWireList = repository.findAllByTinnedWire("Л-22508");
        tinnedWireList.forEach(System.out::println);
    }

}