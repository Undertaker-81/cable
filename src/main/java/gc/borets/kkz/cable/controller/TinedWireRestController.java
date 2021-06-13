package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.model.Wire;
import gc.borets.kkz.cable.repository.TinnedWireInsulatedWireRepository;
import gc.borets.kkz.cable.repository.TinnedWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *   @author Panfilov Dmitriy
 *   13.06.2021
 */
@RestController
@CrossOrigin
@RequestMapping("/tinned")
public class TinedWireRestController {

    @Autowired
    private TinnedWireInsulatedWireRepository repository;

    @Autowired
    private TinnedWireRepository tinnedWireRepository;

    @GetMapping("/{id}/insulated")
    public List<TinnedWireInsulatedWire> getAll(@PathVariable String id) {
        return repository.findAllByTinnedWire(id);
    }

    @GetMapping("/{id}/wire")
    public List<Wire> findWireByTinnedId(@PathVariable String id){
        return tinnedWireRepository.findWireByTinnedWire(id);
    }

}
