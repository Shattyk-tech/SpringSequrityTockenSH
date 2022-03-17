package peaksoft.springspringbootcoursesh.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    @NonNull
    private String name;
    private String surname;
    private String department;
    private int salary;

}
