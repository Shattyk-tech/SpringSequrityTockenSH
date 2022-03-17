package peaksoft.springspringbootcoursesh.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long id;
    private String name;
    private String surname;
    private int salary;
    private String department;
    private boolean blocked;


}
