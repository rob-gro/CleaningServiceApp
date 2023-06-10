package dev.robgro.cleaningserviceapp.service;

import dev.robgro.cleaningserviceapp.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client saveClient(Client client);

    Client getClientById(Long id);

    void deleteClientById(Long id);

}
