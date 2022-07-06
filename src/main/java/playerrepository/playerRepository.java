package playerrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import playerentity.player;

public interface playerRepository extends JpaRepository<player, Integer> {

}
