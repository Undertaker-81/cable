package gc.borets.kkz.cable.controller;
/*
 *   @author Panfilov Dmitriy
 *   13.06.2021
 */

import gc.borets.kkz.cable.model.LeadCoatedWire;
import gc.borets.kkz.cable.repository.BraidedWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/braided")
public class BraidedWireRestController {

    @Autowired
    private BraidedWireRepository braidedWireRepository;

    @GetMapping("/{id}/leadCoated")
    public LeadCoatedWire getAllLeadCoatedByBraidedId(@PathVariable String id){
        return braidedWireRepository.getLeadCoatedByBraidedId(id);
    }

}
