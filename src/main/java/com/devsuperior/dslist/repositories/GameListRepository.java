package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.devsuperior.dslist.entities.GameList;


//ja traz varias ferramentas como consulta
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
