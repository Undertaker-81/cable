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
 * Луженная жила
 */
@Entity
@Table(name = "tinned_wire")
@Data
@NoArgsConstructor
public class TinnedWire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String trackId;

    private String name;

    private int nomenclatureId;

    private double diameter;

    private int weight; //возможно не надо

    private int length;

    private LocalDate dateTinned;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wire_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Wire wire;
/*
    @ManyToMany(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<InsulatedWire> insulatedWires;

 */
}
