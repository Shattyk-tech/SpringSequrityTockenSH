package peaksoft.springspringbootcoursesh.service;

import peaksoft.springspringbootcoursesh.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveuser(User user);

    public User getUser(long id);

    public void deleteUser(long id);


}
