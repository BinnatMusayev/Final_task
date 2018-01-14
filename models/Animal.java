package models;

public class Animal{

	private String animalName;
	private String specieName;
	private String landingType;
	private String songForRequest;

	public Animal(String animalName, String specieName, String landingType, String songForRequest){
		this.animalName = animalName;
		this.specieName = specieName;
		this.landingType = landingType;
		this.songForRequest = songForRequest;
	}

	public String getAnimalName(){
		return this.animalName;
	}

	public String getLandingType(){
		return this.landingType;
	}
	
	public String getSpecieName(){
		return this.specieName;
	}

}