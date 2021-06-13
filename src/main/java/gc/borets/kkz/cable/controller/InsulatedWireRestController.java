package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.repository.TinnedWireInsulatedWireRepository;
import gc.borets.kkz.cable.service.InsulatedService;
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
@RequestMapping("/insulated")
public class InsulatedWireRestController {

    @Autowired
    private InsulatedService service;

    @GetMapping("/{id}/tinned")
    public List<TinnedWire> getTinedByInsulatedId(@PathVariable String id){
        return service.findTinnedWireByInsulated(id);
    }


}
