package org.example.notecollector.service;

import org.example.notecollector.dto.impl.UserDTO;

public interface UserService {
    UserDTO save(UserDTO user);
}
