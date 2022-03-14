package com.spring.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BadmintonistService {

	List<Badmintonist> listOfPlayers=new ArrayList<>(Arrays.asList(
			new Badmintonist(101,"Saina Nehwal", "India", "Singles"),
			new Badmintonist(210, "P V Sindhu", "India", "Singles"),
			new Badmintonist(333, "Jwala Gutta", "India", "Singles"),
			new Badmintonist(151, "Viktor Axels", "Denmark", "Doubles"),
			new Badmintonist(103, "Chen Long", "South Africa", "Doubles")
			));
	
	List<Badmintonist>getPlayers(){
		return listOfPlayers;
	}
	
	Badmintonist getPlayer(int id) {
		return listOfPlayers
				.stream()
				.filter(ref -> ref.getId().equals(id)).findFirst().get();
	}
	
	public void addNewBadmintonist(Badmintonist theBadmintonist) {
		listOfPlayers.add(theBadmintonist);
	}
	
	public void update(int id,Badmintonist theBadmintonist) {
		
//		The tradional way to update
//		for(Badmintonist ref : listOfPlayers) {
//			if(ref.getId().equals(id)) {
//				listOfPlayers.set(listOfPlayers.indexOf(ref), theBadmintonist);
//			}
//		}
		
		//or with the java 8 modern way : one liner
		listOfPlayers.set(
				listOfPlayers.indexOf(listOfPlayers.stream().filter(ref -> ref.getId().equals(id)).findFirst().get()),
				theBadmintonist);

	}
	
	public void deletePlayer(int id) {
		listOfPlayers.remove(
				listOfPlayers.indexOf(listOfPlayers.stream().filter(ref -> ref.getId().equals(id)).findFirst().get()));

	}
}

