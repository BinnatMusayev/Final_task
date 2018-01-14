package models;

import java.util.ArrayList;
import java.util.Random;

public class Zazu{

	private ArrayList<Song> songs;
	private ArrayList<Song> playedSongs;
	Random rn = new Random();

	public Zazu(){
		songs = new ArrayList<Song>();
		playedSongs = new ArrayList<Song>();
	}

	public Zazu(ArrayList<Song> songs){
		this.songs = songs;
		playedSongs = new ArrayList<Song>();
	}


	public void pickRandomSong(){
		if(songs.size() - playedSongs.size() > 0 ){
			int random = rn.nextInt(songs.size()) ;
			if (!songs.get(random).isPlayed()) {
				this.playSong(songs.get(random).getSongName());
				System.out.println("now playing random song: " + songs.get(random).getSongName() );	
			}else{
				pickRandomSong();
			}
			
		}else{
			System.out.println("all songs played");
		}

	}

	public ArrayList listPlayedSongs(){
		for(Song s: songs){
			if(s.isPlayed()){
				playedSongs.add(s);
				System.out.println(s.getSongName());
			}
		}

		return playedSongs;
	}

	//------

	public void playSong(String name){
		for(Song s: songs){
			if(s.getSongName().equals(name) ){
				songs.get(songs.indexOf(s)).setPlayed(true);
				playedSongs.add(s);
			}
		}
	}





}