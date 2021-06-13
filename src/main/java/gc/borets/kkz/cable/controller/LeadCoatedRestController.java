package gc.borets.kkz.cable.controller;

import gc.borets.kkz.cable.model.InsulatedWire;
import gc.borets.kkz.cable.repository.LeadCoatedWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *   @author Panfilov Dmitriy
 *   13.06.2021
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/leadCoated")
public class LeadCoatedRestController {

    @Autowired
    LeadCoatedWireRepository repository;

    @GetMapping("/{id}/insulated")
    public InsulatedWire getInsulatesByLeadCoatedId(@PathVariable String id){
        return repository.getInsulatedByLeadCoatedId(id);
    }
}
