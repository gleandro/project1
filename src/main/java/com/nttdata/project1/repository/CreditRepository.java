package com.nttdata.project1.repository;

import com.nttdata.project1.model.Credit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditRepository extends MongoRepository<Credit, String> {
}
