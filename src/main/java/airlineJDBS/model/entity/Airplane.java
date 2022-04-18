package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String model;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "aircompany_id")
    private Aircompany aircompany;


}
