package com.projectapi.GameStoreSystemAPI.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectapi.GameStoreSystemAPI.model.Game;
import com.projectapi.GameStoreSystemAPI.service.GameService;

@RestController
@RequestMapping("/games") // Root Mapping of the API
public class GameController {

    @Autowired
    private GameService gameService;
    
    @GetMapping("/get/all") // Fetch all data 
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/get/{id}") // Fetch specific data using ID
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        return gameService.getGameById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add") // Add data
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @PutMapping("/update/{id}") // Update specific data using ID
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game) {
        try {
            return ResponseEntity.ok(gameService.updateGame(id, game));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}") // Delete specific data by ID
    public ResponseEntity<Void> deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return ResponseEntity.noContent().build();
    }
}