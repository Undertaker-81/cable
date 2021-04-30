package gc.borets.kkz.cable.model;

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
public class Wire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameWire;

    private int numberCoilSupplier; //номер бухты поставщика

    private int nomenclatureId;

    private double diameter;

    private int weight;

   // private LocalDate date;
}
