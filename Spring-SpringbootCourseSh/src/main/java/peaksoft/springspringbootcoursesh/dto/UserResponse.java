package peaksoft.springspringbootcoursesh.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String name;
    private String surname;
    private String department;
    private int salary;
    private boolean blocked;

}
