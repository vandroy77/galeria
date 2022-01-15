package com.dv.dsgallery.repository;

import com.dv.dsgallery.entities.Movie;
import com.dv.dsgallery.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

    User findByEmail(String email);
}
