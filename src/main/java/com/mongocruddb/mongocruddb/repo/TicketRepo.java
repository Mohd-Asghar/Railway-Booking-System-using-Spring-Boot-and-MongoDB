package com.mongocruddb.mongocruddb.repo;

import com.mongocruddb.mongocruddb.model.TicketModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.Random;
public interface TicketRepo extends CrudRepository<TicketModel,Integer> {
    @Override
    List<TicketModel> findAll();

}
