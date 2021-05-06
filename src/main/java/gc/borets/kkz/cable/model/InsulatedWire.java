package gc.borets.kkz.cable.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 * Изолировання жила компаундом
 */
@Entity
@Table(name = "insulated_wire")
@Data
@NoArgsConstructor
public class InsulatedWire {

    @Id
    private String trackId; //id

    private String name;

    private int nomenclatureId;

    private int cableCrossSection;

    private int length;

    private LocalDate dateInsulated;
/*
    @ManyToMany(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Set<TinnedWire>  tinnedWires;

 */

    @OneToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<TinnedWireInsulatedWire> tinnedWireInsulatedWires;
}
