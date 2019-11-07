package com.example.songsapi.repository;

import com.example.songsapi.model.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

    // TODO: add custom query if necessary
}
