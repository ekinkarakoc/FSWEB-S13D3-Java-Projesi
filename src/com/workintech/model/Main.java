package com.workintech.model;

import com.workintech.model.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ali", "Veli", 30);
        Person dogancan = new Person("Dogancan", "Kinik", 29, 20000, false,
                new String[]{"piano", "chess"});

        System.out.println("salary :D " + dogancan.salary);
        System.out.println("is teen" + dogancan.isTeen());
        System.out.println("Hobbies" + Arrays.toString(dogancan.hobbies));

        Person john = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + john.getFirstName());
        System.out.println("LastName: " + john.getLastName());
        System.out.println("Age: " + john.getAge());

        System.out.println("***************************");

        Wall wall = new Wall(5,6);

        System.out.println(wall.getArea());

        System.out.println("get width " + wall.getWidth());
        System.out.println("get height " + wall.getHeight());
    }
}
