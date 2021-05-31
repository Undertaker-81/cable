package gc.borets.kkz.cable.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 * Бронированние
 */
@Entity
@Table(name = "armored_wire")
@Data
@NoArgsConstructor
public class ArmoredWire {

    @Id
    private String trackId; //id

    @Column(name = "name")
    private String cableName;

    private int nomenclatureId;

    private int cableCrossSection;
    @Column(name = "length")
    private int cableLength;

    private LocalDate dateArmored;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<BraidedWire> braidedWires;

}
