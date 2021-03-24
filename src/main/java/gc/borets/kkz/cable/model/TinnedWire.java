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
 * Луженная жила
 */
@Entity
@Table(name = "tinned_wire")
@Data
@NoArgsConstructor
public class TinnedWire {

    @Id
    private String trackId; //id

    private String name;

    private int nomenclatureId;

    private double diameter;

    private int weight; //возможно не надо

    private int length;

    private LocalDate dateTinned;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "wire_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Wire wire;
}
