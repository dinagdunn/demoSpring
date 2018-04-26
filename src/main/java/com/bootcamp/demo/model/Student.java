package com.bootcamp.demo.model;

public class Student {
    private String name;
    private int age;

    //we need to set getters and setters for these properties..and intelliJ has can automatically generte this for you

    //we also need to create a constructor as well


    public Student() {} //We need this default constructor because Spring will yell at us if we do not have this.

    public Student(String name, int age) { //this is how you instantiate the object initially..the very first time that we create this new object.. this is like a blueprint. The constructor will run one time and runs when the object is created. we need this and then we can use the setters to change these properties
        //constructor vs the setter --> constructor instantiates and sets the properites of the object in ONE swoop.. vs us instantiating the new student and then having to write  noelle.setName(Noelle) after we have a Student noelle = new Student();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //we call this with Noelle.setName("Beyonce") for example
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
