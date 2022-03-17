package peaksoft.springsequritytocken.service.validator;

import com.sun.jdi.connect.VMStartException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.springsequritytocken.dto.UserRequest;
import peaksoft.springsequritytocken.entity.User;
import peaksoft.springsequritytocken.repository.UserRepository;
import peaksoft.springsequritytocken.service.exception.ValdationExceptionType;
import peaksoft.springsequritytocken.service.exception.ValidationException;

@Component
@RequiredArgsConstructor
public class UserRequestValidator {

    private final UserRepository repository;
    public void validate(User registered, UserRequest request){

        if (request == null || registered == null){
            throw new ValidationException(ValdationExceptionType.BAD_REQUEST);
        }
        if (repository.findByEmail(request.getEmail()).isPresent()){
            throw  new ValidationException(ValdationExceptionType.EMAIL_ALREADY_EXIST);
        }
        if (request.getPassword().equals(request.getRepeatPassword())){
            throw  new ValidationException(ValdationExceptionType.PASSWORD_DONT_MATCH);
        }
    }
}
