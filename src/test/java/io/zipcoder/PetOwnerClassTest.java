package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PetOwnerClassTest {

    @Test
    public void defaultConstructorTest() {
        // Given
        PetOwner petOwner = new PetOwner();

        // When
        String expectedName = "Eleonor";

        // Then

        String actualName = petOwner.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void petOwnerConstructorWithNameTest() {
        // Given
        String expectedName = "Sleepy Hallow";

        // When
        PetOwner petOwner = new PetOwner(expectedName);

        // Then
        String actualName = petOwner.getName();
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void setAndGetNameTest(){
        //given
        String expectedName = "Wolfgang Paw";
        Dog dog = new Dog();

        // When
        dog.setName(expectedName);
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void addAndGetPetsTest() {
        // Given
        Pet newCat = new Cat("Kitty Galore");
        Pet newDragon = new Dragon("Blaze");
        Pet newDog = new Dog("Jojo");
        PetOwner petOwner = new PetOwner("Darla");
        petOwner.addPet(newCat);
        petOwner.addPet(newDragon);
        petOwner.addPet(newDog);
        Pet[] expected = new Pet[]{newCat, newDragon, newDog};

        // When
        Pet[] actual = petOwner.getPets();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
