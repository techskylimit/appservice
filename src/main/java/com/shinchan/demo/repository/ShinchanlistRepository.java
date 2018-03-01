package com.shinchan.demo.repository;


import com.shinchan.demo.model.Shinchanlist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "shinchan", path = "shinchan")
public interface ShinchanlistRepository extends MongoRepository<Shinchanlist, String> {
}
