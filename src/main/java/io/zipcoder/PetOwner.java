package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private List<Pet> pets = new ArrayList<Pet>();

    public PetOwner() {
        this.name = "Eleonor";
    }

    public PetOwner(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPet (Pet newPet) {
        pets.add(newPet);
    }

    public Pet[] getPets () {
        return pets.toArray(new Pet[pets.size()]);
    }

    public Integer getNumberOfPets() {
        return pets.size();
    }

}
