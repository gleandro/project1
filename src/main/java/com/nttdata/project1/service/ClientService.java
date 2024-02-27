package com.nttdata.project1.service;

import com.nttdata.project1.model.Client;

import java.util.List;

public interface ClientService {

    public Client addClient(Client client) throws Exception;

    public Client getClient(String id);

    public List<Client> getAllClients();

}
