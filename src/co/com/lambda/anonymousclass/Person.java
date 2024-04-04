/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.anonymousclass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nestormoreno
 */
public class Person {
   
    String name;
    LocalDate birthDate;
    Sex gender;
    String emaiAddress;
    List<Person> persons;

    public Person() {
    }
    
    public enum Sex {
        MALE, FEMALE;
    }
    
    public Person(String name, LocalDate birthDate, Sex gender, String emailAddress) {
    }
    
    private final List<Person> getPersons() {
        persons = new ArrayList<Person>() {{
            add(new Person("Pau", LocalDate.now(), Sex.FEMALE, "pau@pau.com"));
            add(new Person("Jemeche", LocalDate.now(), Sex.FEMALE, "jemeche@pau.com"));
            add(new Person("Chocho", LocalDate.now(), Sex.FEMALE, "chocho@pau.com"));
            add(new Person("Luis", LocalDate.now(), Sex.FEMALE, "luis@pau.com"));
            add(new Person("José", LocalDate.now(), Sex.FEMALE, "jose@pau.com"));
            add(new Person("Pedro", LocalDate.now(), Sex.FEMALE, "pedro@pau.com"));
            add(new Person("Gates", LocalDate.now(), Sex.FEMALE, "gates@pau.com"));
            }};
        return persons;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmaiAddress() {
        return emaiAddress;
    }

    public void setEmaiAddress(String emaiAddress) {
        this.emaiAddress = emaiAddress;
    }
    
    public void printPerson() {
        System.out.println("printing person!!");
    }
    
}
