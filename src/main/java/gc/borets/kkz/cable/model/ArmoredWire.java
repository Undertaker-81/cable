package gc.borets.kkz.cable.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    private String name;

    private int nomenclatureId;

    private int cableCrossSection;

    private int length;

    private LocalDate dateArmored;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<BraidedWire> braidedWires;

}
