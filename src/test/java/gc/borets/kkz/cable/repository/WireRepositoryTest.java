package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.Wire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional(readOnly = true)
class WireRepositoryTest {

    @Autowired
    private WireRepository repository;

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
}