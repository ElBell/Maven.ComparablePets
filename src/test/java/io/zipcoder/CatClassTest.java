package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;


public class CatClassTest {

    @Test
    public void CatConstructionWithNoInput(){
        PetOwner expectedOwner = null;
        String expectedName = "Kitty Galore";
        Integer expectedAge = 0;
        Cat cat = new Cat();

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();
        PetOwner actualOwner = cat.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void CatConstructionWithNameOnly(){
        // Given
        String expectedName = "Fifi";
        Integer expectedAge = 0;
        Cat cat = new Cat(expectedName);

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void CatConstructionWithNameOwner(){
        // Given
        String expectedName = "Carlsburger";
        PetOwner expectedOwner = new PetOwner("Carrie");
        Cat cat = new Cat(expectedName, expectedOwner);

        // When
        String actualName = cat.getName();
        Integer actualOwner = cat.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void CatConstructionWithNameAgeOwner(){
        PetOwner expectedOwner = new PetOwner("Harold");
        String expectedName = "Kumar";
        Integer expectedAge = 12;
        Cat cat = new Cat(expectedName,expectedAge,expectedOwner);

        // When
        String actualName = cat.getName();
        Integer actualAge = cat.getAge();
        PetOwner actualOwner = cat.getOwner();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setAndGetNameTest(){
        //given
        String expectedName = "Scaredy Cat";
        Cat cat = new Cat();

        // When
        cat.setName(expectedName);
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setAndGetOwnerTest(){
        PetOwner expectedOwner = new PetOwner("Harold");
        Cat cat = new Cat();

        // When
        cat.setOwner(expectedOwner);
        PetOwner actualOwner = cat.getOwner();

        // Then
        Assert.assertEquals(expectedOwner, actualOwner);
    }

    @Test
    public void setAndGetAgeTest(){
        Integer expectedAge = 8;
        Cat cat = new Cat();

        // When
        cat.setAge(expectedAge);
        Integer actualAge = cat.getAge();

        // Then
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        //given
        String expectedSpeech = "Meooooow";
        Cat cat = new Cat();
        //when
        String actualSpeech = cat.speak();
        //then
        Assert.assertEquals(expectedSpeech, actualSpeech);

    }

    @Test
    public void sortBetweenSameTypePetsTestUsingComparable(){
        //given
        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
        Cat cat2 = new Cat("Calypso",6, new PetOwner());
        Cat cat3 = new Cat("Pepper",1, null);
        Pet[] expected = new Pet[]{cat2,cat3,cat1};
        //when
        Pet[] actual = Arrays.sort(new Pet[]{cat2,cat3,cat1};);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortBetweenSameTypePetsTestUsingComparator(){
    //given
        Cat cat1 = new Cat("Taboo", 3, new PetOwner());
        Cat cat2 = new Cat("Calypso",6, new PetOwner());
        Cat cat3 = new Cat("Pepper",1, null);
        Pet[] expected = new Pet[]{cat2,cat3,cat1};
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
