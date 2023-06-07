package dev.robgro.cleaningserviceapp.house;

import java.util.*;

public interface HouseService {

    List<House> getAllHouses();

    House saveHouse(House house);

    House getHouseById(Long id);

    void deleteHouseById(Long id);

    List<House> clientHousesList(Long clientId);

    void removeClientFromHouse(Long id);
}
