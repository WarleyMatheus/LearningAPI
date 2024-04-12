package wm.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wm.software.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
