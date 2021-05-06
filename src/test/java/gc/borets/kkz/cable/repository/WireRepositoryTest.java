package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.Wire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional(readOnly = true)
class WireRepositoryTest {

    @Autowired
    private WireRepository repository;

    @Autowired
    private TinnedWireRepository tinnedWireRepository;

    @Test
    void getWireByNumberCoilSupplier() {
        Wire wireByNumberCoilSupplier = repository.getWireByNumberCoilSupplier(101803);
        System.out.println(wireByNumberCoilSupplier);
    }

    @Test
    void findAllByDiameter() {
        List<Wire> wireListByDiam = repository.findAllByDiameter(4.5);
        wireListByDiam.forEach(System.out::println);
    }

    @Test
    void findAllByNomenclatureId() {
        List<Wire> wireListByNom = repository.findAllByNomenclatureId(186925);
        wireListByNom.forEach(System.out::println);
    }

    @Test
    void findAllisNotBusy(){
        Set<Long> t = tinnedWireRepository.findAll().stream().map(tinnedWire -> tinnedWire.getWire().getId()).collect(Collectors.toSet());
        List<Wire> wireList = repository.findAllIsNotBusy(t);
        wireList.forEach(System.out::println);
    }
}