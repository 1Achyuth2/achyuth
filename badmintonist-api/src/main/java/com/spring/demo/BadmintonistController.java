package com.spring.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("badmintonist")
public class BadmintonistController {

	@Autowired
	BadmintonistService service;

//	Get All Players
	@GetMapping("/players")
	List<Badmintonist> getAllPlayers() {
		return service.getPlayers();
	}

//	Get a Badminton player by id
	@GetMapping("/players/{id}")
	Badmintonist getPlayerById(@PathVariable int id) {
		return service.getPlayer(id);
	}

//	Add a new player
	@PostMapping("/players")
	void addNewBadmintonist(@RequestBody Badmintonist theBadmintonist) {
		service.addNewBadmintonist(theBadmintonist);
	}

//	Update an already existing player
	@PutMapping("/players/{id}")
	void updateBadmintonist(@PathVariable int id, @RequestBody Badmintonist theBadmintonist) {
		service.update(id, theBadmintonist);
	}

//	Delete an existing player
	@DeleteMapping("/players/{id}")
	void deletePlayer(@PathVariable int id) {
		service.deletePlayer(id);
	}

}

