package poo_interfaces.printing;

import static poo_interfaces.printing.model.Gender.PROGRAMMING;
import static poo_interfaces.printing.model.Printer.DEFAULT_TEXT;
import static poo_interfaces.printing.model.Printer.sheetPrinter;

import poo_interfaces.printing.model.*;

public class PrintingExample {
    public static void main(String[] args) {

        var resume = new Resume("Hi there", new Person("Jhon", "Doe"), "Computer Engineer");
        resume.addExperience("Java Programmer")
                .addExperience("Oracle DBA")
                .addExperience("Spring Framework")
                .addExperience("Fullstack Developer")
                .addExperience("Angular Developer");

        var book = new Book(new Person("Erich" , "Gamma"), "Designer Patterns", PROGRAMMING);
        book.addPage(new Page("Singleton Pattern"))
                .addPage(new Page("Factory Pattern"))
                .addPage(new Page("Facade Pattern"))
                .addPage(new Page("Composite Pattern"));

        var report = new Report("Microservice study",
                new Person("Martin", "Fowler"),
                new Person("James","Gosling"));
        sheetPrinter(resume);
        sheetPrinter(book);
        sheetPrinter(report);

        sheetPrinter(new Printer() {
            @Override
            public String printer() {
                return "Hi there everybody!!!";
            }
        });

        System.out.println(DEFAULT_TEXT);

    }
}
