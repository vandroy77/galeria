package com.dv.dsgallery.services;


import com.dv.dsgallery.dto.MovieDTO;
import com.dv.dsgallery.dto.ScoreDTO;

import com.dv.dsgallery.entities.Movie;
import com.dv.dsgallery.entities.Score;
import com.dv.dsgallery.entities.User;
import com.dv.dsgallery.repository.MovieRepository;
import com.dv.dsgallery.repository.ScoreRepository;
import com.dv.dsgallery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreServices {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO SaveScore(ScoreDTO dto) {

        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

            Score score = new Score();
            score.SetMovie(movie);
            score.setUser(user);
            score.setValue(dto.getScore());

           score = scoreRepository.saveAndFlush(score);

           double sum = 0.0;
           for (Score s: movie.getScores()) {
                sum = sum + s.getValue();
           }
           double avg = sum / movie.getScores().size();

           movie.setScore(avg);
           movie.setCount(movie.getScores().size());

           movie = movieRepository.save(movie);

           return new MovieDTO(movie);
    }

}
