package com.example.Static_Web_App_Character_api.service;

import com.example.Static_Web_App_Character_api.model.ComicCharacter;
import com.example.Static_Web_App_Character_api.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    // get all characters
    public List<ComicCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }

    // get character by id
    public ComicCharacter getCharacterById(Long id) {
        Optional<ComicCharacter> character = characterRepository.findById(id);

        if (character.isPresent()) {
            return character.get();
        } else {
            throw new RuntimeException("Character not found");
        }
    }

    // add new character
    public ComicCharacter addCharacter(ComicCharacter character) {
        return characterRepository.save(character);
    }

    // update character
    public ComicCharacter updateCharacter(Long id, ComicCharacter updatedCharacter) {

        ComicCharacter character = getCharacterById(id);

        character.setName(updatedCharacter.getName());
        character.setDescription(updatedCharacter.getDescription());
        character.setUniverse(updatedCharacter.getUniverse());
        character.setSpecies(updatedCharacter.getSpecies());
        character.setAge(updatedCharacter.getAge());

        return characterRepository.save(character);
    }

    // delete character
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }

    // get characters by universe
    public List<ComicCharacter> getCharactersByUniverse(String universe) {
        return characterRepository.findCharactersByUniverse(universe);
    }

    // search characters
    public List<ComicCharacter> searchCharacters(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
}