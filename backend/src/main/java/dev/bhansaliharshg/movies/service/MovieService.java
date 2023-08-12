package dev.bhansaliharshg.movies.service;

import dev.bhansaliharshg.movies.dao.MovieRepository;
import dev.bhansaliharshg.movies.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
