package io.zipcoder;

import java.util.*;

public class PetComparator implements Comparator<Pet> {
    public PetComparator() {}

    public int compare(Pet pet1, Pet pet2) {
        if (pet1.getType() > pet2.getType()) {
            return 2;
        } else if (pet1.getType() < pet2.getType()){
            return -2;
        } else {
            if (pet1.getName().equals(pet2.getName())) {
                return 0;
            } else if (pet1.getName().compareTo(pet2.getName()) > 0){
                return 2;
            } else {
                return -2;
            }
        }
    }

    public Pet[] comparatorSort(Pet[] pets) {
        List<Pet> petsList = new ArrayList<Pet>(Arrays.asList(pets));
        Collections.sort(petsList, new PetComparator());
        return petsList.toArray(new Pet[petsList.size()]);
    }



}
