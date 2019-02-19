package io.zipcoder;

public class Dog extends Pet {

    public Dog() {
        super("Floofer", 0, null);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(PetOwner owner) {
        super(owner);
    }

    public Dog(Integer age) {
        super(age);
    }

    public Dog(Integer age, PetOwner owner) {
        super(age, owner);
    }

    public Dog(String name, PetOwner owner) {
        super(name, owner);
    }

    public Dog(String name, Integer age, PetOwner owner) {
        super(name, age, owner);
    }

    @Override
    public int getType() {
        return 3;
    }

    @Override
    public String speak () {
        return "Woof woof";
    }
}
