package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
public class Role {
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
     private int id;
     @Column
     private String categoris;



}
