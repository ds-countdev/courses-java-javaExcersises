package mx.diego.proyect.backyard;

import mx.diego.proyect.home.Person;

import static mx.diego.proyect.home.Person.FEMALE_GENDER;
import static mx.diego.proyect.home.Person.MALE_GENDER;
import static mx.diego.proyect.home.Person.waving;

public class PackageExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("diego");

        Dog dog = new Dog();
        dog.name = "toby";

        System.out.println(dog.playing(person));
        System.out.println(MALE_GENDER);
        System.out.println(FEMALE_GENDER);
        System.out.println(waving());
    }
}
