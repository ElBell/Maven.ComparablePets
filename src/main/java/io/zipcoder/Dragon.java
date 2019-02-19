package io.zipcoder;

public class Dragon extends Pet {

    public Dragon() {
        super("Spike", 0, null);
    }

    public Dragon(String name) {
        super(name);
    }

    public Dragon(PetOwner owner) {
        super(owner);
    }

    public Dragon(Integer age) {
        super(age);
    }

    public Dragon(Integer age, PetOwner owner) {
        super(age, owner);
    }

    public Dragon(String name, PetOwner owner) {
        super(name, owner);
    }

    public Dragon(String name, Integer age, PetOwner owner) {
        super(name, age, owner);
    }


    @Override
    public int getType() {
        return 2;
    }

    @Override
    public String speak () {
        return "Fiyaaaah";
    }
}
