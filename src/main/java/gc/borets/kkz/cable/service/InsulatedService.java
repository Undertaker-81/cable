package gc.borets.kkz.cable.service;

import gc.borets.kkz.cable.model.TinnedWire;
import gc.borets.kkz.cable.model.TinnedWireInsulatedWire;
import gc.borets.kkz.cable.repository.TinnedWireInsulatedWireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
 *   @author Panfilov Dmitriy
 *   13.06.2021
 */
@Service
public class InsulatedService {
    @Autowired
    private TinnedWireInsulatedWireRepository repository;

    public List<TinnedWire> findTinnedWireByInsulated(String insulatedId){
        List<TinnedWireInsulatedWire> tinnedWireInsulatedWires = repository.findAllByInsulatedWireTrackId(insulatedId);
        List<TinnedWire> result = new ArrayList<>();
        for (TinnedWireInsulatedWire cable : tinnedWireInsulatedWires){
            TinnedWire tinnedWire = cable.getTinnedWire();
            tinnedWire.setLength(cable.getLengthTinned());
            result.add(tinnedWire);
        }
        return result;
    }
}
