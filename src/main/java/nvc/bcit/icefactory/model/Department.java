package nvc.bcit.icefactory.model;

import java.util.List;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.NoArgsConstructor;


@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
