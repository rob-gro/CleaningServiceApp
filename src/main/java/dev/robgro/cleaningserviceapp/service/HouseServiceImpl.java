package dev.robgro.cleaningserviceapp.service;

import dev.robgro.cleaningserviceapp.model.Client;
import dev.robgro.cleaningserviceapp.model.House;
import dev.robgro.cleaningserviceapp.repository.HouseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @Override
    @Transactional
      public House saveHouse(House house) {
        return houseRepository.save(house);
    }

    @Override
    @Transactional(readOnly = true)
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
    @Transactional
    public List<House> clientHousesList(Long clientId) {
        return houseRepository.findByClientId(clientId);
    }

    @Override
    @Transactional
    public void removeClientFromHouse(Long id) {
        House house = getHouseById(id);
        if (house != null) {
            house.setClient(null);
            houseRepository.save(house);
        }
    }
}