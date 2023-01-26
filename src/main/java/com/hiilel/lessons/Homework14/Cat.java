package com.hiilel.lessons.Homework14;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("^[a-zA-Z]+$") || name.length() > 35) {
            System.out.println("Invalid input. Please input a valid name.");
        } else {
            this.name = name;
            System.out.println("New name set as " + name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 25) {
            System.out.println("Invalid input. Please enter a value between 1 and 25.");
        } else {
            this.age = age;
            System.out.println("New value age set as " + age);
        }
    }

        public int getWeight () {
            return weight;
        }

    public void setWeight(int weight) {
        if (weight < 1 || weight > 15) {
            System.out.println("Invalid input. Please enter a value between 1 and 15.");
        } else {
            this.weight = weight;
            System.out.println("New value age set as " + weight);
        }
    }



}


