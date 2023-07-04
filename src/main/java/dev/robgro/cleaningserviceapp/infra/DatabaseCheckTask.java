package dev.robgro.cleaningserviceapp.infra;

import dev.robgro.cleaningserviceapp.repository.ClientRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCheckTask {

    private final ClientRepository clientRepository;
    private final DataLoader dataLoader;

    public DatabaseCheckTask(ClientRepository clientRepository, DataLoader dataLoader) {
        this.clientRepository = clientRepository;
        this.dataLoader = dataLoader;
    }

    @Scheduled(cron = "0 */30 * * * *")
    public void checkAndInsertMissingRecords() {
        long count = clientRepository.count();
        if (count == 0) {
            dataLoader.loadInitialData();
        }
    }
}
