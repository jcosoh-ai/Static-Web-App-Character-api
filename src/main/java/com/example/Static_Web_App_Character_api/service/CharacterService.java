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
    public Optional<ComicCharacter> getCharacterById(Long id) {
        return characterRepository.findById(id);
    }

    // add new character
    public ComicCharacter addCharacter(ComicCharacter character) {
        return characterRepository.save(character);
    }

    // update character
    public Optional<ComicCharacter> updateCharacter(Long id, ComicCharacter updatedCharacter) {
        Optional<ComicCharacter> optionalCharacter = characterRepository.findById(id);
        if (optionalCharacter.isPresent()) {
            ComicCharacter character = optionalCharacter.get();
            character.setName(updatedCharacter.getName());
            character.setDescription(updatedCharacter.getDescription());
            character.setUniverse(updatedCharacter.getUniverse());
            character.setSpecies(updatedCharacter.getSpecies());
            character.setAge(updatedCharacter.getAge());
            return Optional.of(characterRepository.save(character));
        } else {
            return Optional.empty();
        }
    }

    // delete character
    public boolean deleteCharacter(Long id) {
        if (characterRepository.existsById(id)) {
            characterRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
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