package playerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import playerentity.player;
import playerrepository.playerRepository;



@Service
public class playerservice {
	
	@Autowired
	private playerRepository repository;
	
	public player addplayer(player player) {
		return repository.save(player);
	}
		
		public player getplayerById(int id) {
			return repository.findById(id).orElse(null);
		}
		
		public List<player> getAllplayers() {
			return repository.findAll();
		}
		
}
		
