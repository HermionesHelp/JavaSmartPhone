package com.company;

public class Mp3Player {
    private int ram;
    private String applications;
    private int weight;
    private int size;
    private int storage;

    private String playMusic(String songName){
        return "You are listening to " + songName;
    }

    private String createPlaylist(String songName, String playlistName){
        return "You added " + songName + " to the " + playlistName + " playlist.";
    }

    private String playSnake(){
        return "You played Snake.";
    }
}
