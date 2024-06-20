package poo_set.model;

public class Student {
    String name;
    int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return this.name;}

    @Override
    public String toString(){
        return "Student name: " + this.name +
                ", Student age: " + this.age;
    }

}
