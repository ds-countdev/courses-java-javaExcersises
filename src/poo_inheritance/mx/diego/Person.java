package poo_inheritance.mx.diego;

class Person {

    String name;
    String lastName;
    int age;
    String email;

    Person(){System.out.println("Initializing Person constructor");}
    Person(String name) {this(); this.name = name;}
    Person(String name, String lastName){this(name); this.lastName =lastName;}
    Person(String name, String lastName, int age) {this(name, lastName); this.age = age;}
    Person(String name, String lastName, int age, String email) {this(name, lastName, age); this.email = email;}
}
