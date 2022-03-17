package peaksoft.springsequritytocken.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Email;

@Data
public class UserRequest {
    @NonNull
    @Email
    private String email;
    @NonNull
    private String firstNAme;
    @NonNull
    private String lastNAme;
    @NonNull
    private String password;
    private String repeatPassword;
    private String address;


}
