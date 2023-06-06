package dev.robgro.cleaningserviceapp.house;

import dev.robgro.cleaningserviceapp.client.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @Override
    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    public House getHouseById(Long id) {
        Optional<House> houseOptional = houseRepository.findById(id);
        return houseOptional.orElseThrow(() -> new NoSuchElementException("House not found with ID: " + id));
    }

    @Override
    public void deleteHouseById(Long id) {
        House house = getHouseById(id);

        if (house != null) {
            Client houseClient = house.getClient();
            if (houseClient != null) {
                houseClient.getHouses().remove(house);
            }
            houseRepository.delete(house);
        }
    }

    @Override
    public List<House> clientHousesList(Long client_id) {
        return houseRepository.findByClientId(client_id);
    }
}