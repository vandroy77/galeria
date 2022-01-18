package com.dv.dsgallery.controllers;

import com.dv.dsgallery.dto.MovieDTO;
import com.dv.dsgallery.entities.Movie;
import com.dv.dsgallery.repository.MovieRepository;
import com.dv.dsgallery.services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieServices services;

    @Autowired
    private MovieRepository movierep;

    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable) {
        return services.findAll(pageable);
    };

    @GetMapping(value = "{id}")
    public MovieDTO findById(@PathVariable Long id) {
        return services.findById(id);
    }


}
