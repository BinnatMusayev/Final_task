package models;


import java.util.ArrayList;
public class Rafiki{

	private ArrayList<Animal> guests;

	public Rafiki(ArrayList<Animal> guests){
		this.guests = guests;
	}

	public boolean isGuestAllowed(String name){
		for(Animal a: guests){
			if(a.getAnimalName().equalsIgnoreCase(name) ){
				return true;
			}
		}
		return false;
	}

	public String checkNeedsByAnimalName(String animalName){
		for(Animal a: guests){
			if(a.getAnimalName().equalsIgnoreCase(animalName) ){
				String answer;
				switch (a.getLandingType()) {
					case "land":
						answer = animalName + " needs: Number of paws" ;
					break;

					case "water":
						answer = animalName + " needs: Water Tank" ;
					break;

					case "air":
						answer = animalName + " needs: The extension of its wings" ;
					break;

					default:
						answer =  "Undefined Needs because of incorrect landing type";
					break;
				}
				return answer;	
			}
		}
		return "There is no such animal"	;
	}

	public String checkNeedsBySpecieName(String specieName){
		for(Animal a: guests){
			if(a.getSpecieName().equalsIgnoreCase(specieName) ){
				String answer;
				switch (a.getSpecieName()) {
					case "lion" :
						answer = specieName + " needs: Number of paws" ;
					break;
					case "turtle"  :
						answer = specieName + " needs: Number of paws" ;
					break;
					case "panda"  :
						answer = specieName + " needs: Number of paws" ;
					break;
					case  "dog"  :
						answer = specieName + " needs: Number of paws" ;
					break;
					case  "cat" :
						answer = specieName + " needs: Number of paws" ;
					break;

					case "fish" :
						answer = specieName + " needs: Water Tank" ;
					break;
					case  "shark":
						answer = specieName + " needs: Water Tank" ;
					break;

					case "leylek":
						answer = specieName + " needs: The extension of its wings" ;
					break;
					case  "qartal":
						answer = specieName + " needs: The extension of its wings" ;
					break;

					default:
						answer =  "Undefined Needs because of incorrect specie name";
					break;
				}
				return answer;	
			}
		}
		return "There is no such specie recorded between guests"	;
	}

}