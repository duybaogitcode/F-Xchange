package com.safenet.fxchange.repositories;

import com.safenet.fxchange.entities.Type;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends MongoRepository<Type, ObjectId> {
}
