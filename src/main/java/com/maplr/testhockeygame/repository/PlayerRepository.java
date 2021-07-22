package com.maplr.testhockeygame.repository;

import com.maplr.testhockeygame.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Creation of the repository JPA "PlayerRepository"
 * */
@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    Player findByNumber(Long number);
}
