package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<String> listOfNames = new ArrayList<>();

    public Person() {
        this.name = "Demo Person";
        this.addName("Demo Person");
    }


    public Person(String name) {
        //  Need Test Case
        this.name = name;
        this.addName(name);
    }

    public Person(int age) {
        //  Need Test Case
        this.name = "Demo Person";
        this.age = age;
        this.addName("Demo Person");
    }

    public Person(String name, int age) {
        //  Need Test Case
        this.name = name;
        this.age = age;
        this.addName(name);
    }

    public void setName(String name) {
        //  Need Test Case
        this.removeName(this.name);
        this.name = name;
        this.addName(name);

    }

    public void setAge(int age) {
        //  Need Test Case
        this.age = age;
    }

    public String getName() {
        //  Need Test Case
        return this.name;
    }

    public List<String> getNames() {
        //  Need Test Case
        return this.listOfNames;
    }

    public Integer getAge() {
        //  Need Test Case
        return this.age;
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void setListOfNames(List<String> listOfNames) {
        this.listOfNames = listOfNames;
    }

    public void addName(String name){
        //  Need Test Case
        this.listOfNames.add(name);
    }

    public void removeName(String name){
        //  Need Test Case

        this.listOfNames.remove(name);
    }

    public int getSizeOfList(){
        return this.listOfNames.size();
    }


}
