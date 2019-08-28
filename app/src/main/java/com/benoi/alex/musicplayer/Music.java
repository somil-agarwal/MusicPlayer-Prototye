package com.benoi.alex.musicplayer;


public class Music {
    private String music_name;
    private String artist_name;
    private String album_name;

    Music(String music_name, String artist_name, String album_name) {
        this.music_name = music_name;
        this.artist_name = artist_name;
        this.album_name = album_name;
    }

    public String getMusic_name() {
        return music_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }



}
