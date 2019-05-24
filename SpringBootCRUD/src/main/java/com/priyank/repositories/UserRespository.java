package com.priyank.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.priyank.entities.User;

@Repository
public interface UserRespository extends CrudRepository<User, Long> {

	List<User> findByName(String name);
}
