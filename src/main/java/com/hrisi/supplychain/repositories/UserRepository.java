package com.hrisi.supplychain.repositories;

import com.hrisi.supplychain.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findById(long id);
}
