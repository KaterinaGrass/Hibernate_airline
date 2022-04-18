package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Aircompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;


}
