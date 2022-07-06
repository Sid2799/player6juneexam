package playercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import playerentity.player;
import playerservice.playerservice;

public class playercontroller {
	
	@Autowired
	private playerservice service;
	
	@GetMapping("/player/{id}")
	public player getplayerById(@PathVariable int id) {
		return service.getplayerById(id);		
	}
	
	@GetMapping("/players")
	public List<player> getplayers(){
		return service.getAllplayers();
	}
	
	
	@PostMapping("/addplayers")
	public player saveplayer(@RequestBody player player) {	
		return service.addplayer(player);	
	}

}
