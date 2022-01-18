package com.dv.dsgallery.controllers;

import com.dv.dsgallery.dto.MovieDTO;
import com.dv.dsgallery.dto.ScoreDTO;
import com.dv.dsgallery.services.MovieServices;
import com.dv.dsgallery.services.ScoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreServices scoreServices;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        MovieDTO movieDTO = scoreServices.SaveScore(dto);
        return movieDTO;
    };



}
