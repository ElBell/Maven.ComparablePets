package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetComparatorTest {

    @Test
    public void comparatorTest() {
        // Given
        Pet[] testPets = new Pet[]{new Cat("Begin"), new Dog("First"), new Cat("First"), new Turtle("Start")};
        Comparator petComparator = new PetComparator();

        // When
        Pet[] actualPets = petComparator.comparatorSort(testPets);


        // Then
        Pet[] expectedPets = new Pet[]{new Dog("First"), new Turtle("Start"), new Cat("First"), new Cat("First")};

        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void comparatorTest2() {
        // Given
        Pet[] testPets = new Pet[]{new Cat("Laptop"), new Dog("Other"), new Turtle("Desktop"), new Turtle("Windows")};
        Comparator petComparator = new PetComparator();

        // When
        Pet[] actualPets = petComparator.comparatorSort(testPets);


        // Then
        Pet[] expectedPets = new Pet[]{new Dog("Other"), new Turtle("Desktop"),  Turtle("Windows"), new Cat("Laptop")};

        Assert.assertEquals(expectedPets, actualPets);
    }
}
