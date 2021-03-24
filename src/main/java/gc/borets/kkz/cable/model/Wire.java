package gc.borets.kkz.cable.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author Panfilov Dmitriy
 * 22.03.2021
 */
@Entity
@Data
@NoArgsConstructor
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
