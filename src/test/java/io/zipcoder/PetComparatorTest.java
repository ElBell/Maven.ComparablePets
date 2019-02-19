package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetComparatorTest {

    @Test
    public void comparatorTest() {
        // Given
        Pet[] testPetList = new Pet[]{new Cat("Kitty Galore"),(new Dragon("Blaze"),(new Dog("Jojo"), Cat("Blaze", 3,null)};
        Comparator petComparator = new PetComparator();
        Pet[] expected = new Pet[]{new Cat("Kitty Galore"),( new Cat("Blaze", 3,null)),(new Dragon("Blaze")),(new Dog("Jojo"))};

        // When
        Pet[] actual = petComparator.comparatorSort(testPetList);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTest2() {
        Pet[] testPetList = new Pet[]{
                new Cat("Kitty Galore"),
                new Dragon("Blaze"),
                new Dog("Jojo"),
                new Cat("Blaze", 3,null),
                new Cat("Taboo", 3, new PetOwner()),
                new Dragon("Balthazar",6, new PetOwner()),
                new Dog ("Mipsy",1, null),
                new Cat("Fluffy")};
        Comparator petComparator = new PetComparator();

        Pet[] expected = new Pet[]{
                new Cat("Blaze", 3,null),
                new Cat("Fluffy")
                new Cat("Kitty Galore"),
                new Cat("Taboo", 3, new PetOwner()),
                new Dragon("Balthazar",6, new PetOwner()),
                new Dragon("Blaze"),
                new Dog("Jojo"),
                new Dog ("Mipsy",1, null),
                };

        // When
        Pet[] actual = petComparator.comparatorSort(testPetList);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
