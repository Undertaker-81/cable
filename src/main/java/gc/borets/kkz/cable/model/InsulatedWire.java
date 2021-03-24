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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tinned_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private TinnedWire tinnedWire;
}
