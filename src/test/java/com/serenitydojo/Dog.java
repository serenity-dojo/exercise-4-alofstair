package com.serenitydojo;

public class Dog {
    private String name;

    private String favoriteToy;

    private int age;

    public static final String DOG_NOISE = "Woof";


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

    public void makesNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed() {
        isFed();
    }

    public boolean isFed() {
        System.out.println("True");
        return true;
    }
}
