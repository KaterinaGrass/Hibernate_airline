package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class AirplaneRoute {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "route_id")
    private Route route;


}
