package gc.borets.kkz.cable.repository;

import gc.borets.kkz.cable.model.BraidedWire;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        System.out.println(cable);
    }

    @Test
    public void getAllBraidedByArmored(){
        List<BraidedWire> cable = armoredWireRepository.findAllBraided("б-29230");
       // System.out.println(cable);
        cable.forEach(System.out::println);
    }

}