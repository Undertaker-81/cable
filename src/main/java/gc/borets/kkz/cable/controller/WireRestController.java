package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.model.Wire;
import gc.borets.kkz.cable.repository.TinnedWireInsulatedWireRepository;
import gc.borets.kkz.cable.repository.WireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Panfilov Dmitriy
 * 29.04.2021
 */
@RestController
@CrossOrigin
public class WireRestController {


    @Autowired
    private WireRepository wireRepository;


    @PostMapping("/wire/new")
    public void create(@RequestBody Wire wire){
        wireRepository.saveAndFlush(wire);
    }

    @GetMapping(value = "/wire", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Wire> getAll(){
        return wireRepository.findAll();
    }
}
