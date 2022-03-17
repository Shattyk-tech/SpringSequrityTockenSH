package peaksoft.springsequritytocken.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private String id;
    private String firstNAme;
    private String lastNAme;
    private String email;
    private String address;
    private boolean enabled;
}
