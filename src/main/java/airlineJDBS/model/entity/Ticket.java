package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "route_id")
    private Route route;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Column
    private String passport_data;


}
