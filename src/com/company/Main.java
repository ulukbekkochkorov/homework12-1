package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Motroskin");
        cat.setColor("Grey");
        cat.setAge(2d);
        System.out.println("The cat's name is - " + cat.getName());
        System.out.println("Its color is " + cat.getColor());
        System.out.println("It is - " + cat.getAge());
        cat.speak();
    }
    }

