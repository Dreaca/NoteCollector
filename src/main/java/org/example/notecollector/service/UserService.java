package org.example.notecollector.service;

import org.example.notecollector.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO user);
    List<UserDTO> getAllUsers();
    UserDTO getUser(String userId);
    boolean deleteUser(String userId);
    boolean updateUser(String userId,UserDTO user);
}
