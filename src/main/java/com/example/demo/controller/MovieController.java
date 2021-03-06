package com.example.demo.controller;

import com.example.demo.domain.model.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}
