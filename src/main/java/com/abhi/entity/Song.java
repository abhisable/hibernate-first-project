package com.abhi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Song {

	@Id
	@Column(name="song_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//identity tells that id generation is being taken care by database vendor in our case mysql
	int id;
	
	@Column(name="song_name")
	String songName;
	
	@Column(name="singer")
	String artist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}
	
	
}
