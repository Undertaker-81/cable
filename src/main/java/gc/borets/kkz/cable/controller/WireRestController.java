package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.ArmoredWire;
import gc.borets.kkz.cable.model.BraidedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.repository.ArmoredWireRepository;
import gc.borets.kkz.cable.repository.BraidedWireRepository;
import gc.borets.kkz.cable.repository.TinnedWireInsulatedWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 29.04.2021
 */
@RestController
public class WireRestController {

    @Autowired
    private BraidedWireRepository braidedWireRepository;

    @Autowired
    private TinnedWireInsulatedWireRepository tinnedWireInsulatedWireRepository;

    @Autowired
    private ArmoredWireRepository armoredWireRepository;

    @GetMapping("/all")
    public List<ArmoredWire> allArmoredWire() {
        return armoredWireRepository.findAll();
    }

    @GetMapping("/braided/{id}")
    public List<BraidedWire> getAllBraidedByArmoredId(@PathVariable String id){
        return armoredWireRepository.findAllBraided(id);
    }

    @GetMapping("/insulated/{id}")
    public  List<TinnedWireInsulatedWire> getAll(@PathVariable String id) {
        return tinnedWireInsulatedWireRepository.findAllByTinnedWire(id);
    }
}
