package com.viniciusfrois.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sbmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
