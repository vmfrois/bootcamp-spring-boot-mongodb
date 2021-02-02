package com.viniciusfrois.sbmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sbmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
