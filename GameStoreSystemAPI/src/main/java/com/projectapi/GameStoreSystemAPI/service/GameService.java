package com.projectapi.GameStoreSystemAPI.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectapi.GameStoreSystemAPI.model.Game;
import com.projectapi.GameStoreSystemAPI.repository.GameStoreRepository;

@Service
public class GameService {

    @Autowired
    private GameStoreRepository gameRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> getGameById(Long id) {
        return gameRepository.findById(id);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game updatedGame) {
        return gameRepository.findById(id).map(game -> {
            game.setTitle(updatedGame.getTitle());
            game.setDeveloper(updatedGame.getDeveloper());
            game.setGenre(updatedGame.getGenre());
            game.setReleaseDate(updatedGame.getReleaseDate());
            game.setPlatform(updatedGame.getPlatform());
            game.setPrice(updatedGame.getPrice());
            game.setStocks(updatedGame.getStocks());
            return gameRepository.save(game);
        }).orElseThrow(() -> new RuntimeException("Game not found"));
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }
}