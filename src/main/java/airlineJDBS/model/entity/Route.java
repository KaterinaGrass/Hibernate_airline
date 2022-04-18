package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Route {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private  int departure_id;
    @Column
    private int arrival_id;
    @Column
    private String departure;
    @Column
    private String arrival;


}
