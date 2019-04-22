package com.example.jpa.demoJpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Animals {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private long id_animals;
    private String name;
    private String chip;

    public Animals(long id_animals, String name, String chip, Date birth, boolean ppp) {
        super();
        this.id_animals = id_animals;
        this.name = name;
        this.chip = chip;

    }

    public Animals() {
        super();
    }

    public long getId_animals() {
        return id_animals;
    }

    public void setId_animals(long id_animals) {
        this.id_animals = id_animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }
}
