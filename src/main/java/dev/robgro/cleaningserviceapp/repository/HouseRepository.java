package dev.robgro.cleaningserviceapp.repository;

import dev.robgro.cleaningserviceapp.model.House;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface HouseRepository extends JpaRepository<House, Long> {

    List<House> findByClientId(Long clientId);
}
