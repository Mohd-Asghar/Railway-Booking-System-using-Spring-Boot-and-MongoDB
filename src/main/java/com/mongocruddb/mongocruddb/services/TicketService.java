package com.mongocruddb.mongocruddb.services;

import com.mongocruddb.mongocruddb.model.TicketModel;
import com.mongocruddb.mongocruddb.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//to create the rest api method
@Service
public class TicketService {
    //to get crud method of mongodb
    @Autowired
    private TicketRepo repo;
    //add,fetch,delete,update tickets

    public TicketModel addTicket(TicketModel model) {
        return repo.save(model);
    }

    public List<TicketModel> getAllTickets() {
        return repo.findAll();
    }
    public String deleteTicket(int ticketId){
        repo.deleteById(ticketId);
        return ticketId + "id is deleted Successfully";
    }
    public TicketModel updateTicket(int ticketId,TicketModel model){
        model.setBookingId(ticketId);
        return repo.save(model);
    }
    public Optional<TicketModel> getTicketById(int ticketId){
        return repo.findById(ticketId);
    }
}
