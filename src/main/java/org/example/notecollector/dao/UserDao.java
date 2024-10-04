package org.example.notecollector.dao;

import org.example.notecollector.entity.impl.UserEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//Sets as a dao layer object or an interface. Meta annotated as a component
public interface UserDao extends JpaRepository<UserEntity, String> {
}
