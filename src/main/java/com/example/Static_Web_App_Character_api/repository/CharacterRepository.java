package com.example.Static_Web_App_Character_api.repository;

import java.util.List;

import com.example.Static_Web_App_Character_api.model.ComicCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CharacterRepository extends JpaRepository<ComicCharacter, Long> {

    
    @Query("SELECT c FROM ComicCharacter c WHERE c.universe = ?1")
    List<ComicCharacter> findCharactersByUniverse(String universe);

    // search by name containing text
    List<ComicCharacter> findByNameContainingIgnoreCase(String name);

}