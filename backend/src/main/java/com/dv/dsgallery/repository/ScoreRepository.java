package com.dv.dsgallery.repository;

import com.dv.dsgallery.entities.Score;
import com.dv.dsgallery.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, ScorePK> {

}
