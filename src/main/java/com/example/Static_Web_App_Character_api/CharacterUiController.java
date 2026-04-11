package com.example.Static_Web_App_Character_api;

import com.example.Static_Web_App_Character_api.model.ComicCharacter;
import com.example.Static_Web_App_Character_api.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/characters")
public class CharacterUiController {


    
    @Autowired
    private CharacterService characterService;

    // 🔹 INDEX PAGE
    @GetMapping
    public String getAllCharacters(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "characters-list";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    // 🔹 DETAILS PAGE
    @GetMapping("/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {
        ComicCharacter character = characterService.getCharacterById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        model.addAttribute("character", character);
        return "characters-details";
    }

    // 🔹 SHOW CREATE FORM
    @GetMapping("/createForm")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new ComicCharacter()); // important
        return "characters-create";
    }

    // 🔹 CREATE CHARACTER
    @PostMapping("/create")
    public String createCharacter(ComicCharacter character) {
        characterService.addCharacter(character);
        return "redirect:/characters";
    }

    // 🔹 SHOW UPDATE FORM
    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        ComicCharacter character = characterService.getCharacterById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        model.addAttribute("character", character);
        return "characters-update";
    }

    // 🔹 UPDATE CHARACTER
    @PostMapping("/update")
    public String updateCharacter(ComicCharacter character) {
        characterService.updateCharacter(character.getCharacterId(), character);
        return "redirect:/characters/" + character.getCharacterId();
    }

    // 🔹 DELETE
    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/characters";
    }
}