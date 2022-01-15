package com.dv.dsgallery.repository;

import com.dv.dsgallery.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long> {

}
