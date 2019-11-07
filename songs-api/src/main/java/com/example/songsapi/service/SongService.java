package com.example.songsapi.service;

import com.example.songsapi.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {
    public Song createSong(Song newSong);
    public Optional<Song> getSongById(Long songId);
    public List<Song> getSongs();
    public Song updateSong(Song song);
    public void deleteSong(Long songId);

}
