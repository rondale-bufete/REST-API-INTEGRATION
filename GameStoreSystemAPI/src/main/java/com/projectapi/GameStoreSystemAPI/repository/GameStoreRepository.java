package com.projectapi.GameStoreSystemAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectapi.GameStoreSystemAPI.model.Game;

public interface GameStoreRepository extends JpaRepository<Game, Long> {
    
}