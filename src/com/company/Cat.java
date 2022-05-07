package com.company;

public class Cat {
    private String name;
    private String color;
    private double age;

    void setName (String name1) {
        name = name1;
    }public String getName () {
        return name;
    }
    void setColor (String color1){
        color = color1;
    }public String getColor(){
        return color;
    }
    void setAge (Double age1){
        age = age1;
    }public double getAge() {
        return age;
    }
   public void speak () {
        System.out.println("Мяу, мяу, мяу");
    }
}

