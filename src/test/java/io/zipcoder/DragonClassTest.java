package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DragonClassTest {

    @Test
    public void dragonConstructionWithNoInput(){
        PetOwner expectedOwner = null;
        String expectedName = "Spike";
        Integer expectedAge = 0;
        Dragon dragon = new Dragon();

        // When
        String actualName = dragon.getName();
        Integer actualAge = dragon.getAge();
        PetOwner actualOwner = dragon.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void dragonConstructionWithNameOnly(){
        // Given
        String expectedName = "Aragon";
        Integer expectedAge = 0;
        Dragon dragon = new Dragon(expectedName);

        // When
        String actualName = dragon.getName();
        Integer actualAge = dragon.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void dragonConstructionWithNameOwner(){
        // Given
        String expectedName = "Agni";
        PetOwner expectedOwner = new PetOwner("Arthur");
        Dragon dragon = new Dragon(expectedName, expectedOwner);

        // When
        String actualName = dragon.getName();
        Integer actualOwner = dragon.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void dragonConstructionWithNameAgeOwner(){
        PetOwner expectedOwner = new PetOwner("Harold");
        String expectedName = "Pyro";
        Integer expectedAge = 145;
        Dragon dragon = new Dragon(expectedName,expectedAge,expectedOwner);

        // When
        String actualName = dragon.getName();
        Integer actualAge = dragon.getAge();
        PetOwner actualOwner = dragon.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setAndGetNameTest(){
        //given
        String expectedName = "Smaug";
        Dragon dragon = new Dragon();

        // When
        dragon.setName(expectedName);
        String actualName = dragon.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setAndGetOwnerTest(){
        PetOwner expectedOwner = new PetOwner("Habberdash");
        Dragon dragon = new Dragon();

        // When
        dragon.setOwner(expectedOwner);
        PetOwner actualOwner = dragon.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setAndGetAgeTest(){
        Integer expectedAge = 378;
        Dragon dragon = new Dragon();

        // When
        dragon.setAge(expectedAge);
        Integer actualAge = dragon.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        //given
        String expectedSpeech = "Fiyaaaah";
        Dragon dragon = new Dragon();
        //when
        String actualSpeech = dragon.speak();
        //then
        Assert.assertEquals(expectedSpeech, actualSpeech);

    }

    @Test
    public void sortBetweenSameTypePetsTestUsingComparable(){
        //given
        Dragon dragon1 = new Dragon("Eragon", 1190, null);
        Dragon dragon2 = new Dragon("Smaug",99, new PetOwner());
        Dragon dragon3 = new Dragon("Brauble",400, null);
        Pet[] expected = new Pet[]{dragon1,dragon2,dragon3};
        //when
        Pet[] actual = Arrays.sort(new Pet[]{dragon1,dragon2,dragon3};);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortBetweenSameTypePetsTestUsingComparator(){
        //given
        Dragon dragon1 = new Dragon("Eragon", 1190, null);
        Dragon dragon2 = new Dragon("Smaug",99, new PetOwner());
        Dragon dragon3 = new Dragon("Brauble",400, null);
        Pet[] expected = new Pet[]{dragon1,dragon2,dragon3};
        //when
        Pet[] actual = Arrays.sort(new Pet[]{cat2,cat3,cat1};);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortBetweenDifferentTypePetsTestComparable(){
        //given
        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
        Dragon dragon = new Dragon("Balthazar",6, new PetOwner());
        Dog dog = new Dog("Mipsy",1, null);
        Pet[] expected = new Pet[]{dragon,dog,cat1};
        //when
        Pet[] actual = Arrays.sort(new Pet[]{cat1,dog, dragon};);
        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void sortBetweenTwoDifferentTypePetsTestComparator(){
        //given
        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
        Dragon dragon = new Dragon("Balthazar",6, new PetOwner());
        Dog dog = new Dog("Mipsy",1, null);
        Pet[] expected = new Pet[]{cat1,dragon,dog};
        //when
        Pet[] actual = Arrays.sort(new Pet[]{cat1,dog, dragon};);
        //then
        Assert.assertEquals(expected,actual);
    }
}
