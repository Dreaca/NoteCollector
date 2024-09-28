package org.example.notecollector.service.impl;

import jakarta.transaction.Transactional;
import org.example.notecollector.dao.UserDao;
import org.example.notecollector.dto.impl.UserDTO;
import org.example.notecollector.entity.impl.UserEntity;
import org.example.notecollector.service.UserService;
import org.example.notecollector.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private Mapping mapping;

    @Override
    public UserDTO saveUser(UserDTO user) {
        UserEntity saved = userDao.save(mapping.toUserEntity(user));
        return mapping.toUserDTO(saved);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDTO getUser(String userId) {
        return null;
    }

    @Override
    public boolean deleteUser(String userId) {
        return false;
    }

    @Override
    public boolean updateUser(String userId, UserDTO user) {
        return false;
    }
}
