package com.projectapi.GameStoreSystemAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "games_tbl") // Table use for the project, 
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Variables Used
    private Long id;
    private String title;
    private String developer;
    private String genre;
    private String releaseDate;
    private String platform;
    private int price;
    private int stocks;


    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getReleaseDate() { return releaseDate; }
    public void setReleaseDate(String releaseDate) { this.releaseDate = releaseDate; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getStocks() { return stocks; }
    public void setStocks(int stocks) { this.stocks = stocks; }

}