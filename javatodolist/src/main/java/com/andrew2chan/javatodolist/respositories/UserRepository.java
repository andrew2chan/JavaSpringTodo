package com.andrew2chan.javatodolist.respositories;

import com.andrew2chan.javatodolist.domain.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
}
