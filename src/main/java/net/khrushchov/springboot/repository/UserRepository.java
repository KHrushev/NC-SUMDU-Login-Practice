package net.khrushchov.springboot.repository;

import net.khrushchov.springboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Client, Long>{
	Client findByEmail(String email);
}
