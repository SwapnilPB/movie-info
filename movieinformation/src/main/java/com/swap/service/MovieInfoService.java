package com.swap.service;

import com.swap.model.MovieInfo;
import com.swap.model.MovieRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MovieInfoService {
    @GetMapping("movieInfo/{movieName}")
    List<MovieInfo> getMoviesInfo(@PathVariable("movieName") String movieName) {
       /* List<MovieRating> ratings = Arrays.asList(
                new MovieRating("Nayak", 4),
                new MovieRating("Bhayanak", 3)
        );

        return ratings.stream().map(rating -> {
                    return new MovieInfo("Nayak", "1990");
                })
                .collect(Collectors.toList());*/
        return Arrays.asList(
                new MovieInfo("Nayak", "1990"),
                new MovieInfo("Bhyanak", "1998")
        );
        

    }
}
