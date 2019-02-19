package io.zipcoder;

public class Cat extends Pet{

    public Cat() {
        super("Kitty Galore", 0, null);
    }
    public Cat(String name) {
        super(name);
    }

    public Cat(PetOwner owner) {
        super(owner);
    }

    public Cat(Integer age) {
        super(age);
    }

    public Cat(Integer age, PetOwner owner) {
        super(age, owner);
    }

    public Cat(String name, PetOwner owner) {
        super(name, owner);
    }

    public Cat(String name, Integer age, PetOwner owner) {
        super(name, age, owner);
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public String speak () {
        return "Meooooow";
    }

}
