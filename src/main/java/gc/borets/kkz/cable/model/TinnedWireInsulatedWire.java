package gc.borets.kkz.cable.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tinned_wire_insulated_wire")
@Data
@NoArgsConstructor
public class TinnedWireInsulatedWire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tinned_wire_track_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private TinnedWire tinnedWire;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "insulated_wire_track_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
  //  @ToString.Exclude
    private InsulatedWire insulatedWire;

    private Integer lengthTinned;
}
