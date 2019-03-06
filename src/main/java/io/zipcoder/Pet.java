package io.zipcoder;

public abstract class Pet implements Comparable<Pet>{
    private String name;
    private Integer age;
    private PetOwner owner;

    public Pet() {
        owner = null;
        name = "";
        age = 0;
    }

    public Pet(String name) {
        this();
        this.name = name;
    }

    public Pet(PetOwner owner) {
        this();
        this.owner = owner;
    }

    public Pet(Integer age) {
        this();
        this.age = age;
    }

    public Pet(Integer age, PetOwner owner) {
        this();
        this.owner = owner;
        this.age = age;
    }

    public Pet(String name, PetOwner owner) {
        this();
        this.owner = owner;
        this.name = name;
    }

    public Pet(String name, Integer age, PetOwner owner) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public PetOwner getOwner () {
        return owner;
    }

    public String getName () {
        return name;
    }
    public Integer getAge () {
        return age;
    }

    public String speak () {
        return "I am a pet";
    }

    public void setOwner (PetOwner owner) {
        this.owner = owner;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    public int getType() { return 0; }


    public int compareTo(Pet pet) {
        int nameCompare = name.compareTo(pet.getName());
        if(nameCompare == 0) {
            return getType() - pet.getType();
        }
        return nameCompare;
    }


}
