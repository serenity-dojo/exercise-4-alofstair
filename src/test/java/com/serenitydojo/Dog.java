package com.serenitydojo;

public class Dog {
    private String name;

    private String favoriteToy;

    private int age;


    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void dogSound() {
        makeNoise();

    }

    public String makeNoise() {
        System.out.println("Woof");
        return ("Woof");
    }

    public void feed() {
        isFed();
    }

    public boolean isFed() {
        System.out.println("True");
        return true;
    }
}
