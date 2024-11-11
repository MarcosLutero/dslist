package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;


//ja traz varias ferramentas como consulta
public interface GameRepository extends JpaRepository<Game, Long> {

}
