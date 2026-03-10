package com.example.Static_Web_App_Character_api.controller;

import com.example.Static_Web_App_Character_api.model.ComicCharacter;
import com.example.Static_Web_App_Character_api.service.CharacterService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // GET all characters
    @GetMapping
    public List<ComicCharacter> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // GET character by ID
    @GetMapping("/{id}")
    public ComicCharacter getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    // POST new character
    @PostMapping
    public ComicCharacter addCharacter(@RequestBody ComicCharacter character) {
        return characterService.addCharacter(character);
    }

    // PUT update character
    @PutMapping("/{id}")
    public ComicCharacter updateCharacter(@PathVariable Long id, @RequestBody ComicCharacter character) {
        return characterService.updateCharacter(id, character);
    }

    // DELETE character
    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
    }

    // GET characters by category (universe example)
    @GetMapping("/category/{universe}")
    public List<ComicCharacter> getCharactersByUniverse(@PathVariable String universe) {
        return characterService.getCharactersByUniverse(universe);
    }

    // SEARCH characters by name
    @GetMapping("/search")
    public List<ComicCharacter> searchCharacters(@RequestParam String name) {
        return characterService.searchCharacters(name);
    }
}