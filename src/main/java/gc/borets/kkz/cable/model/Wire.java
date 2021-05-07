package gc.borets.kkz.cable.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "wire")
@AllArgsConstructor
public class Wire {

    @Id
    @SequenceGenerator( name = "pk_sequence", sequenceName = "pk_sequence", allocationSize = 1, initialValue = 100 )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    private long id;

    private String nameWire;

    private int numberCoilSupplier; //номер бухты поставщика

    private int nomenclatureId;

    private double diameter;

    private int weight;

    public Wire(String nameWire, int numberCoilSupplier, int nomenclatureId, double diameter, int weight) {
        this.nameWire = nameWire;
        this.numberCoilSupplier = numberCoilSupplier;
        this.nomenclatureId = nomenclatureId;
        this.diameter = diameter;
        this.weight = weight;
    }

    // private LocalDate date;
}
