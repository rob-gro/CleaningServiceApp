package dev.robgro.cleaningserviceapp.service;

import dev.robgro.cleaningserviceapp.model.Client;
import dev.robgro.cleaningserviceapp.model.House;
import dev.robgro.cleaningserviceapp.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        return clientOptional.orElseThrow(() -> new NoSuchElementException("Client not found with ID: " + id));
    }

    @Override
    public void deleteClientById(Long id) {

        Client client = getClientById(id);

        if (client != null) {
            List<House> clientHouses = client.getHouses();
            if (clientHouses != null) {
                for (House house : clientHouses) {
                    house.setClient(null);
                }
            }
            clientRepository.delete(client);
        }
    }
}