package peaksoft.springsequritytocken.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_sequence")
    @SequenceGenerator(name = "role_sequence",sequenceName = "role_seq",allocationSize = 1)
    private long id;
    private String name;
}
