package com.example.Static_Web_App_Character_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "characters")

public class ComicCharacter {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column
private String image;

    private String universe;
    private String species;
    private int age;

   
    public ComicCharacter() {
    }

   
    public ComicCharacter(String name, String description, String universe, String species, int age) {
        this.name = name;
        this.description = description;
        this.universe = universe;
        this.species = species;
        this.age = age;
    }

    // getters and setters

    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
    return image;
}

public void setImage(String image) {
    this.image = image;
}


    public Long getId() {
    return characterId;
}
}