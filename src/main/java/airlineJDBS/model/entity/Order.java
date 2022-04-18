package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int number;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    public String order_data;


}
