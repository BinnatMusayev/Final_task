package models;

import java.util.ArrayList;

public class Mufasa{

	private ArrayList<Animal> guests;

	public Mufasa(ArrayList<Animal> guests){
		this.guests = guests;
	}


	public void addGuest(Animal animal){
		guests.add(animal);
	}

	public boolean removeGuest(String name){
		for(Animal a: guests){
			if(a.getAnimalName().equals(name) ){
				guests.remove(guests.indexOf(a));
				return true;
			}
		}
		return false;
	}

	public ArrayList<Animal> getGuestsList(){
		return this.guests;
	}

}