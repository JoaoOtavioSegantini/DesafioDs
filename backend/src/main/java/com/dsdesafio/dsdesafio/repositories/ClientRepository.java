package com.dsdesafio.dsdesafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsdesafio.dsdesafio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
