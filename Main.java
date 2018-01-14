
import models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

		public static void main(String[] args){
			ArrayList<Animal> guests = new ArrayList<Animal>();
			ArrayList<Song> songs = new ArrayList<Song>();

			Mufasa mufasa = new Mufasa(guests);

			mufasa.addGuest(new Animal("Simba", "lion", "land", "Let it go"));
			mufasa.addGuest(new Animal("nemo", "fish", "water", "hello"));
			mufasa.addGuest(new Animal("leanardo", "turtle", "land", "I am a human"));
			mufasa.addGuest(new Animal("po", "panda", "land", "they don't care about us"));
			mufasa.addGuest(new Animal("leylek", "bird", "air", "beautiful"));
			mufasa.addGuest(new Animal("qartal", "bird", "air", "come away with me now"));
			mufasa.addGuest(new Animal("akula", "shark", "water", "nothing else matters"));
			mufasa.addGuest(new Animal("alabas", "dog", "land", "numb"));
			mufasa.addGuest(new Animal("garfield", "cat", "land", "skyfall"));


			//some preload songs
			songs.add(new Song("Let it go", false));
			songs.add(new Song("hello", false));
			songs.add(new Song("I am a human", false));
			songs.add(new Song("they don't care about us", false));
			songs.add(new Song("beautiful", false));
			songs.add(new Song("come away with me now", false));
			songs.add(new Song("nothing else matters", false));
			songs.add(new Song("numb", false));
			songs.add(new Song("skyfall", false));
			songs.add(new Song("ghost", false));
			songs.add(new Song("why are you here?", false));

			Zazu zazu = new Zazu(songs);

			Rafiki rafiki = new Rafiki(mufasa.getGuestsList() );


			Scanner sc = new Scanner(System.in);

			System.out.println("*****Welcome to \"Hakuna Matata\" party*****");
			System.out.println("You can use these commands: \n *registerGuest"
								+ "\n *removeGuest "
								+ "\n *pickSong"
								+ "\n *listPlayedSongs "
								+ "\n *isAnimalOnGuestList "
								+ "\n *animalNeedsByAnimalName"
								+ "\n *animalNeedsBySpecieName"
								+ "\n *exit " );

			String command = sc.nextLine();

			while(!command.equals("exit") ){
				switch(command){
					case "registerGuest":
						System.out.println("enter name of animal:");
						String animalName = sc.nextLine();
						System.out.println("enter specie of animal:");
						String animalSpecie = sc.nextLine();
						System.out.println("enter landing type of animal:");
						String animalLangingType = sc.nextLine();
						System.out.println("enter song for reserve of animal:");
						String animalSong = sc.nextLine();

						mufasa.addGuest(new Animal(animalName, animalSpecie, animalLangingType, animalSong));
						System.out.println(animalName + " added to guest list successfully");
					break;
					case "removeGuest":
						System.out.println("Enter the name of animal to be removed: ");
						String removeName = sc.nextLine();
						if(mufasa.removeGuest(removeName) ){
							System.out.println(removeName + " removed successfully");
						}else{
							System.out.println("there is not any animal with this name in guest list");
						}
					break;
					case "pickSong":
						zazu.pickRandomSong();
					break;

					case "listPlayedSongs":
						// System.out.println("Played songs:");
						zazu.listPlayedSongs();
					break;
					case "isAnimalOnGuestList":
						System.out.println("enter the name of animal to check: ");
						String isOnGuestListName = sc.nextLine();
						if(rafiki.isGuestAllowed(isOnGuestListName) ){
							System.out.println("Yes, this animal is on the guest list");
						}else{
							System.out.println("No, this animal is not on the guest list");
						}
					break;
					case "animalNeedsByAnimalName":
						System.out.println("enter the name of animal to check the needs of animal: ");
						String needsByName = sc.nextLine();
						System.out.println(rafiki.checkNeedsByAnimalName(needsByName));
					break;
					case "animalNeedsBySpecieName":
						System.out.println("enter a specie to check the needs of that specie: ");
						String needsBySpecie = sc.nextLine();
						System.out.println(rafiki.checkNeedsBySpecieName(needsBySpecie));
					break;
					default:
						System.out.println("undefined command");
					break;

				}

				command = sc.nextLine();
			}
			



		}


}