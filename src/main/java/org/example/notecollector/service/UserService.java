package org.example.notecollector.service;

import org.example.notecollector.dto.UserStatus;
import org.example.notecollector.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO user);
    List<UserDTO> getAllUsers();
    UserStatus getUser(String userId);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO user);
}
