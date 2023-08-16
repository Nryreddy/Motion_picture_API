package dev.nry.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<movies>> getallMovie()
    {
        return new ResponseEntity<List<movies>>(movieService.allMovies(), HttpStatus.OK);
    }

}
