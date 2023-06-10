package dev.robgro.cleaningserviceapp.repository;

import dev.robgro.cleaningserviceapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}