package dev.robgro.cleaningserviceapp.house;

import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface HouseRepository extends JpaRepository<House, Long> {

    List<House> findByClientId(Long clientId);
}
