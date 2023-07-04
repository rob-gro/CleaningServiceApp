package dev.robgro.cleaningserviceapp.infra;

import dev.robgro.cleaningserviceapp.repository.ClientRepository;
import dev.robgro.cleaningserviceapp.repository.HouseRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCheckTask {

    private final ClientRepository clientRepository;
    private final HouseRepository houseRepository;
    private final DataLoader dataLoader;

    public DatabaseCheckTask(ClientRepository clientRepository, HouseRepository houseRepository, DataLoader dataLoader) {
        this.clientRepository = clientRepository;
        this.houseRepository = houseRepository;
        this.dataLoader = dataLoader;
    }

    @Scheduled(cron = "* */20 * * * *")
    public void checkAndInsertMissingRecords() {
        long countClients = clientRepository.count();
        long countHouses = houseRepository.count();
        if ((countClients == 0) || (countHouses == 0)) {
            dataLoader.loadInitialData();
        }
    }
}
