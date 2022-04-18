package airlineJDBS.model.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn (name="role_id")
    private Role role;
}
