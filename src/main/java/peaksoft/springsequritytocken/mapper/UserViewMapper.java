package peaksoft.springsequritytocken.mapper;

import org.springframework.stereotype.Component;
import peaksoft.springsequritytocken.dto.UserResponse;
import peaksoft.springsequritytocken.entity.User;

@Component
public class UserViewMapper {

    public UserResponse viewUser(User user){

        if (user == null){
            return null;
        }
        UserResponse response = new UserResponse();
        if (user.getId()!= null){
            response.setId(String.valueOf(user.getId()));
        }
        response.setEmail(user.getEmail());
        response.setAddress(user.getAddress());
        response.setFirstNAme(user.getFirstNAme());
        response.setLastNAme(user.getLastNAme());
        response.setEnabled(user.isEnabled());

        return response;
    }


}
