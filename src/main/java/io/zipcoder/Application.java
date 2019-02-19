package io.zipcoder;


import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        PetOwner owner = new PetOwner();
        String newName = console.getStringInput("What's your name?\n");
        owner.setName(newName);
        Integer numberOfPets = console.getIntegerInput(String.format("Hello %s! How many pets do you have?\n", owner.getName()));
        if (numberOfPets <= 0) {
            console.println("Okay, then this isn't the place for you");
        } else {
            for (int i = numberOfPets; i > 0; i--) {
                    getPet(i, console, owner);
            }
        }
        for (Pet pet : owner.getPets()) {
            System.out.println(pet.getName());
        }

    }

    public static Pet getPet(int i, IOConsole console, PetOwner owner) {
        String newPetType = console.getStringInput(String.format("Okay, %d more to add. Is your pet a dog, dragon, or cat?\n", i)).toLowerCase();
        Pet newPet = null;
        if (newPetType.equals("dog") || newPetType.equals("cat") || newPetType.equals("dragon")) {
            String newPetName = console.getStringInput(String.format("And what's their name?\n"));
            if (newPetType.equals("dog")) {
                newPet = new Dog(newPetName);
            } else if (newPetType.equals("cat")) {
                newPet = new Cat(newPetName);
            } else {
                newPet = new Dragon(newPetName);
            }
            owner.addPet(newPet);
            console.println(String.format("Thank you for adding %s :)", newPet.getName()));
        } else {
            console.println("Sorry, we're not looking for " + newPetType + "s");
        }
        return newPet;
    }
}
