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
 * Оплетенная жила
 */
@Entity
@Table(name = "braided_wire")
@Data
@NoArgsConstructor
public class BraidedWire {

    @Id
    private String trackId; //id

    private String name;

    private int nomenclatureId;

    private int cableCrossSection;

    private int length;

    private LocalDate dateBraided;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lead_coated_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private LeadCoatedWire leadCoatedWire;

}
