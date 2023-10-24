package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

//    @BeforeEach
//
//    public void setup(){
//        Person person1 = new Person();
//    }

    @Test

    void testNullaryConsturctor(){
        Person person1 = new Person();

        assertTrue(person1 instanceof Person);
        assertTrue(person1.getName() == "Demo Person");
    }

    @Test

    void testNameParamConstructor(){
        Person person1 = new Person("Julio");

        assertEquals("Julio", person1.getName());
    }

    @Test

    void testMultiParamConstructor(){
        Person person1 = new Person("Julio", 29);

        assertEquals("Julio", person1.getName());
    }

    @Test

    void testAgeParamConstructor(){
        Person person1 = new Person(29);

        assertEquals(29, person1.getAge());
    }

    @Test

    void setName() {
        Person person1 = new Person();

        person1.setName("Julio");

        assertEquals("Julio", person1.getName());
    }

    @Test
    void setAge() {
        Person person1 = new Person();

        person1.setAge(29);

        assertEquals(29, person1.getAge());
    }


    @Test
    void getName() {
        Person person1 = new Person();

        person1.setName("Julio");

        assertEquals("Julio", person1.getName());

    }

    @Test
    void getAge() {
        Person person1 = new Person();

        person1.setAge(29);

        assertEquals(29, person1.getAge());
    }

    @Test
    void addName() {
        Person person1 = new Person();

        person1.addName("Johann");

        List expected = List.of("Demo Person", "Johann");

        assertEquals(expected, person1.getNames());
        assertTrue(person1.getListOfNames().contains("Johann"));

    }

    @Test
    void removeName() {
        Person person1 = new Person();

        person1.addName("Johann");

        assertFalse(person1.getName().contains("Johann"));

    }

    @Test
    void getSizeOfList() {
        Person person1 = new Person();

        person1.addName("Johann");

        List expected = List.of("Demo Person", "Johann");

        assertEquals(2, person1.getNames().size());

    }
}