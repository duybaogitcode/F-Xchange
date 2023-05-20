package com.safenet.fxchange.repositories;

import com.safenet.fxchange.entities.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role,Integer> {
}
