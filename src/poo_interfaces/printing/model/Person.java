package poo_interfaces.printing.model;

public class Person {

    String name;
    String lastName;

    Person () {}


    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name +" "+ lastName;
    }
}
