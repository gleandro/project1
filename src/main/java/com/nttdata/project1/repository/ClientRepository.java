package com.nttdata.project1.repository;

import com.nttdata.project1.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {

}
