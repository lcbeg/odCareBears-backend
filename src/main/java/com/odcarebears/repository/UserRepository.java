package com.odcarebears.repository;

import org.springframework.data.repository.CrudRepository;

import com.odcarebears.entity.*;

public interface UserRepository extends CrudRepository<User, Long>{

}
