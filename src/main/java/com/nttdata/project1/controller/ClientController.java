package com.nttdata.project1.controller;

import com.nttdata.project1.model.Client;
import com.nttdata.project1.model.ResponseApi;
import com.nttdata.project1.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/add")
    public ResponseApi<Client> addClient(@RequestBody Client client) {
        ResponseApi<Client> response = new ResponseApi<>();
        try {
            Client tClient = clientService.addClient(client);
            response.setData(tClient);
            return response;
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            return response;
        }
    }

    @GetMapping("/{id}")
    public ResponseApi<Client> getClient(@PathVariable String id) {
        ResponseApi<Client> response = new ResponseApi<>();
        Client tCLient = clientService.getClient(id);
        if (tCLient == null) {
            response.setMessage("Client " + id + " not found");
            return response;
        }
        response.setData(tCLient);
        return response;
    }

    @GetMapping
    public ResponseApi<List<Client>> getAllClients() {
        ResponseApi<List<Client>> response = new ResponseApi<>();
        response.setData(clientService.getAllClients());
        return response;
    }

}
