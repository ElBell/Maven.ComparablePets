package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogClassTest {

    @Test
    public void dogConstructionWithNoInput(){
        PetOwner expectedOwner = null;
        String expectedName = "Floofer";
        Integer expectedAge = 0;
        Dog dog = new Dog();

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();
        PetOwner actualOwner = dog.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void dogConstructionWithNameOnly(){
        // Given
        String expectedName = "Wally";
        Integer expectedAge = 0;
        Dog dog = new Dog(expectedName);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void dogConstructionWithNameOwner(){
        // Given
        String expectedName = "Fido";
        PetOwner expectedOwner = new PetOwner("Carrie");
        Dog dog = new Dog(expectedName, expectedOwner);

        // When
        String actualName = dog.getName();
        PetOwner actualOwner = dog.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void dogConstructionWithNameAgeOwner(){
        PetOwner expectedOwner = new PetOwner("Harold");
        String expectedName = "Chubs";
        Integer expectedAge = 5;
        Dog dog = new Dog(expectedName,expectedAge,expectedOwner);

        // When
        String actualName = dog.getName();
        Integer actualAge = dog.getAge();
        PetOwner actualOwner = dog.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
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
    public void setAndGetOwnerTest(){
        PetOwner expectedOwner = new PetOwner("Bobby");
        Dog dog = new Dog();

        // When
        dog.setOwner(expectedOwner);
        PetOwner actualOwner = dog.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setAndGetAgeTest(){
        Integer expectedAge = 12;
        Dog dog = new Dog();

        // When
        dog.setAge(expectedAge);
        Integer actualAge = dog.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        //given
        String expectedSpeech = "Woof woof";
        Dog dog = new Dog();
        //when
        String actualSpeech = dog.speak();
        //then
        Assert.assertEquals(expectedSpeech, actualSpeech);

    }

//    @Test
//    public void sortBetweenSameTypePetsTestUsingComparable(){
//        //given
//        Dog dog1 = new Dog("Echo", 11, null);
//        Dog dog2 = new Dog("Georgie",6, new PetOwner());
//        Dog dog3 = new Dog("Zoolander",4, null);
//        Pet[] expected = new Pet[]{cat2,cat3,cat1};
//        //when
//        Pet[] actual = Arrays.sort(new Pet[]{cat2,cat3,cat1};);
//        //then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void sortBetweenSameTypePetsTestUsingComparator(){
//        //given
//        Dog dog1 = new Dog("Echo", 11, null);
//        Dog dog2 = new Dog("Georgie",6, new PetOwner());
//        Dog dog3 = new Dog("Zoolander",4, null);
//        Pet[] expected = new Pet[]{cat2,cat3,cat1};
//        //when
//        Pet[] actual = Arrays.sort(new Pet[]{cat2,cat3,cat1};);
//        //then
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void sortBetweenDifferentTypePetsTestComparable(){
//        //given
//        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
//        Dragon dragon = new Dragon("Balthazar",6, new PetOwner());
//        Dog dog = new Dog("Mipsy",1, null);
//        Pet[] expected = new Pet[]{dragon,dog,cat1};
//        //when
//        Pet[] actual = Arrays.sort(new Pet[]{cat1,dog, dragon};);
//        //then
//        Assert.assertEquals(expected,actual);
//
//    }
//
//    @Test
//    public void sortBetweenTwoDifferentTypePetsTestComparator(){
//        //given
//        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
//        Dragon dragon = new Dragon("Balthazar",6, new PetOwner());
//        Dog dog = new Dog("Mipsy",1, null);
//        Pet[] expected = new Pet[]{cat1,dragon,dog};
//        //when
//        Pet[] actual = Arrays.sort(new Pet[]{cat1,dog, dragon};);
//        //then
//        Assert.assertEquals(expected,actual);
//    }
}
