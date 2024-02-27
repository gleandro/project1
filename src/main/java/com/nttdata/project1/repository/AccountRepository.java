package com.nttdata.project1.repository;

import com.nttdata.project1.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
