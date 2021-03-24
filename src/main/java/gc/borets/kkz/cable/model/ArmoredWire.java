package gc.borets.kkz.cable.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 * Бронированная жила
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

    private LocalDate dateLeadCoated;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "braided_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private BraidedWire braidedWire;

}
