package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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
        PetOwner petOwner = new PetOwner("expectedName");

        // Then
        Integer actualName = petOwner.getName();
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
        PetOwner petOwner = new PetOwner("Darla");
        petOwner.addPet(new Cat("Kitty Galore"));
        petOwner.addPet(new Dragon("Blaze"));
        petOwner.addPet(new Dog("Jojo"));
        Pet[] expected = new Pet[]{new Cat("Kitty Galore"),(new Dragon("Blaze"),(new Dog("Jojo")};

        // When
        Pet[] actual = petOwner.getPets();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
