package com.example.songsapi.controller;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SongsApiController {
    @Autowired
    private SongServiceImpl songService;

    @PostMapping("/")
    public Song createSong(Song newSong){
        return songService.createSong(newSong);
    }
    @GetMapping("/list")
    public List<Song> listSongs(){
        return songService.getSongs();
    }
    @GetMapping("/{songId}")
    public Optional<Song> getSongById(@PathVariable Long songId){
        return songService.getSongById(songId);
    }
    @PutMapping("/")
    public Song getSong(Song song){
        return songService.updateSong(song);
    }
    @DeleteMapping("/{songId}")
    public void getSong(@PathVariable Long songId){
        songService.deleteSong(songId);
    }
}
