package anamed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import anamed.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
