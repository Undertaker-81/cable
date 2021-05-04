package gc.borets.kkz.cable.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 * Освинцованная жила
 */
@Entity
@Table(name = "lead_coated_wire")
@Data
@NoArgsConstructor
public class LeadCoatedWire {

    @Id
    private String trackId; //id

    private String name;

    private int nomenclatureId;

    private int cableCrossSection;

    private int length;

    private LocalDate dateLeadCoated;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insulated_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private InsulatedWire insulatedWire;
}
