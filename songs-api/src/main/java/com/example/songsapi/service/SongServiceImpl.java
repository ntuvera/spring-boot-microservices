package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import com.example.songsapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {
//    @Autowired
//    private Song song;

    @Autowired
    SongRepository songRepository;

    @Override
    public Song createSong(Song newSong) {
        return songRepository.save(newSong);
    }

    @Override
    public Optional<Song> getSongById(Long songId) {
        return songRepository.findById(songId);
    }

    @Override
    public List<Song> getSongs() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Song updateSong(Song song) {
        // TODO: Verify if need findById as well?
        return songRepository.save(song);
    }

    @Override
    public void deleteSong(Long songId) {
        songRepository.deleteById(songId);
        // TODO: what to send back if this works?
    }
}
