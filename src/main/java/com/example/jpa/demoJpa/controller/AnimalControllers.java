package com.example.jpa.demoJpa.controller;

import com.example.jpa.demoJpa.model.Animals;
import com.example.jpa.demoJpa.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalControllers {
    @Autowired
    private AnimalRepository animalRepository;

    @RequestMapping("")
    public List<Animals> listAnimals() {

        return animalRepository.findAll();
    }

    @RequestMapping(value="", method= RequestMethod.POST)
    public Animals createAnimals(@RequestBody Animals animal) {

        return animalRepository.save(animal);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/{animalsId}")
    public Animals updateAnimals(@PathVariable("animalsId") Long animalsId, @RequestBody Animals animal){

        if (animal != null && animalRepository.exists(animalsId)){

            Animals oldAnimal = animalRepository.findOne(animalsId);

            oldAnimal.setName(animal.getName());
            oldAnimal.setChip(animal.getChip());

            return animalRepository.save(oldAnimal);
        }
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{animalsId}")
    public Animals readAnimals(@PathVariable("animalsId") Long animalsId){
        return animalRepository.findOne(animalsId);
    }
}
