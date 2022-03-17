package peaksoft.springsequritytocken.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springsequritytocken.dto.UserRequest;
import peaksoft.springsequritytocken.entity.User;

@Component
public class UserEditMapper {

    public User create(UserRequest request){

        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstNAme(request.getFirstNAme());
        user.setLastNAme(request.getLastNAme());
        user.setAddress(request.getAddress());
        user.setEnabled(user.isEnabled());
        user.setPassword(request.getPassword());

        return user;

    }

}
