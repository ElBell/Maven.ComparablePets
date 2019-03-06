package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class PetComparatorTest {

    @Test
    public void comparatorTest() {
        // Given
        Cat test1 = new Cat("Kitty Galore");
        Dragon test2 = new Dragon("Blaze");
        Dog test3 = new Dog("Jojo");
        Cat test4 = new Cat("Blaze", 3,null);
        Cat test5 = new Cat("Taboo", 3, new PetOwner());
        Dragon test6 = new Dragon("Balthazar",6, new PetOwner());
        Dog test7 = new Dog ("Mipsy",1, null);

        Pet[] testPetList = new Pet[]{test1, test3, test6};
        PetComparator petComparator = new PetComparator();
        Pet[] expected = new Pet[]{test1, test6, test3};

        // When
        Pet[] actual = petComparator.comparatorSort(testPetList);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void comparatorTest2() {
        Cat test1 = new Cat("Kitty Galore");
        Dragon test2 = new Dragon("Blaze");
        Dog test3 = new Dog("Jojo");
        Cat test4 = new Cat("Blaze", 3,null);
        Cat test5 = new Cat("Taboo", 3, new PetOwner());
        Dragon test6 = new Dragon("Balthazar",6, new PetOwner());
        Dog test7 = new Dog ("Mipsy",1, null);

        Pet[] testPetList = new Pet[]{test1, test2, test3, test4, test5, test6, test7};
        PetComparator petComparator = new PetComparator();
//
//        for (Pet pet: testPetList) {
//            System.out.print(pet.getType());
//            System.out.println(pet.getName());
//        }
//        System.out.println(" ");

        Pet[] expected = new Pet[]{test4, test1, test5, test6, test2, test3, test7};

        // When
        Pet[] actual = petComparator.comparatorSort(testPetList);
        for (Pet pet: actual) {
            System.out.print(pet.getType());
            System.out.println(pet.getName());
        }

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest() {
        Cat test1 = new Cat("Kitty Galore");
        Dragon test2 = new Dragon("Blaze");
        Dog test3 = new Dog("Jojo");
        Cat test4 = new Cat("Blaze", 3,null);
        Cat test5 = new Cat("Taboo", 3, new PetOwner());
        Dragon test6 = new Dragon("Balthazar",6, new PetOwner());
        Dog test7 = new Dog ("Mipsy",1, null);

        Pet[] testPets = new Pet[]{test1, test2, test3, test4, test5, test6, test7};

        List<Pet> testPetList = new ArrayList<Pet>(Arrays.asList(testPets));


        Pet[] expected = new Pet[]{test6, test4, test2, test3, test1, test7, test5};

        // When
        Collections.sort(testPetList);

        Pet[] actual = testPetList.toArray(new Pet[testPetList.size()]);

        for (Pet pet: actual) {
            System.out.print(pet.getType());
            System.out.println(pet.getName());
        }

        // Then
        Assert.assertEquals(expected, actual);
    }
}
