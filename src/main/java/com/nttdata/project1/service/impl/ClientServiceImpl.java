package com.nttdata.project1.service.impl;

import com.nttdata.project1.model.Client;
import com.nttdata.project1.repository.ClientRepository;
import com.nttdata.project1.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client addClient(Client client) throws Exception {
        Client tClient = getClient(client.getId());
        if (tClient != null) {
            throw new Exception("Client " + client.getId() + " already exists");
        }
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(String id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
