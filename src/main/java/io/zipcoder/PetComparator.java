package io.zipcoder;

import java.util.*;

public class PetComparator implements Comparator<Pet> {
    public PetComparator() {}

    public int compare(Pet pet1, Pet pet2) {
        int typeCompare = pet1.getType() - pet2.getType();
        if(typeCompare == 0) {
            return pet1.getName().compareTo(pet2.getName());
        }
        return typeCompare;
    }

    public Pet[] comparatorSort(Pet[] pets) {
        List<Pet> petsList = new ArrayList<Pet>(Arrays.asList(pets));
        Collections.sort(petsList, new PetComparator());
        return petsList.toArray(new Pet[0]);
    }

}
