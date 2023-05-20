package com.safenet.fxchange.repositories;

import com.safenet.fxchange.entities.PointHistory;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointHistoryRepository extends MongoRepository<PointHistory, ObjectId> {
}
