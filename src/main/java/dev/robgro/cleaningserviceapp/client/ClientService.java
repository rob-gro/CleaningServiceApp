package dev.robgro.cleaningserviceapp.client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client saveClient(Client client);

    Client getClientById(Long id);

    void deleteClientById(Long id);

}
