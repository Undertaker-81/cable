package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.ArmoredWire;
import gc.borets.kkz.cable.model.BraidedWire;
import gc.borets.kkz.cable.repository.ArmoredWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/armored")
public class ArmoredWireRestController {

    @Autowired
    private ArmoredWireRepository armoredWireRepository;

    @GetMapping("/all")
    public List<ArmoredWire> allArmoredWire() {
        return armoredWireRepository.findAll();
    }

    @GetMapping("/{id}/braided")
    public List<BraidedWire> getAllBraidedByArmoredId(@PathVariable String id){
        return armoredWireRepository.findAllBraided(id);
    }
}
