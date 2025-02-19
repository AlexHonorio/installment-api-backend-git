package com.alexdev.sispag.domain.repository;

import com.alexdev.sispag.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {

    List<Client> findByName(String name);

    List<Client> findByNameContaining(String name);

    Optional<Client> findByEmail(String email);
}
