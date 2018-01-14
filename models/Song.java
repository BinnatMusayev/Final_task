package models;

public class Song{

	private String songName;
	private boolean played;

	public Song(String songName, boolean played){
		this.songName = songName;
		this.played = played;
	}

	public String getSongName(){
		return this.songName;
	}

	public void setSongName(String songName){
		this.songName = songName;
	}

	public boolean isPlayed(){
		return this.played;
	}

	public void setPlayed(boolean played){
		this.played = played;
	}

}