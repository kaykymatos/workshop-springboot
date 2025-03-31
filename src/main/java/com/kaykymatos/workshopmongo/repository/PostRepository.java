package com.kaykymatos.workshopmongo.repository;

import com.kaykymatos.workshopmongo.domain.Post;
import com.kaykymatos.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
