package poo_set;

import poo_set.model.Student;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetUnityExample {

    public static void main(String[] args) {

        var studentSet = new HashSet<Student>();

        //var studentSet = new TreeSet<Student>((a,b) -> a.getName().compareTo(b.getName()));
        studentSet.add(new Student("Diego", 30));
        studentSet.add(new Student("Alejandro", 29));
        studentSet.add(new Student("Pedro", 29));
        studentSet.add(new Student("Amanda", 29));
        studentSet.add(new Student("Zoe", 29));
        studentSet.add(new Student("Romina", 29));
        studentSet.add(new Student("Romina", 29));

        for (Student student : studentSet) System.out.println(student);

        var studentIterator = studentSet.iterator();

        System.out.println("//////////// while iterator");

        do {
            System.out.println(studentIterator.next().getName());
        } while (studentIterator.hasNext());

        System.out.println("/////////// iterating foreach lambda");

        studentSet.forEach(System.out::println);
    }
}
