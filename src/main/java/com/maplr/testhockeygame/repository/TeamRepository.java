package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Creation of the repository JPA "TeamRepository"
 * */
@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {

    Team findByYear(Long year);
}
