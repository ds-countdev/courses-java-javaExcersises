package poo_interfaces.printing.model;

import java.util.ArrayList;
import java.util.List;

public class Book implements Printer{

    List<Printer> pages;
    Person author;
    String title;
    Gender gender;

    public Book(Person author, String title, Gender gender){
        this.author = author;
        this.title = title;
        this.gender = gender;
        this.pages = new ArrayList<>();
    }

    public Book addPage(Printer page){
        this.pages.add(page);
        return this;
    }

    @Override
    public String printer() {
        StringBuilder stringBuilder = new StringBuilder("Tittle: ").append(this.title).append("\n")
                .append("Author: ").append(this.author.name).append("\n")
                .append("Gender: ").append(this.gender).append("\n");
        for (Printer sheet : this.pages) stringBuilder.append(sheet.printer()).append("\n");
        return stringBuilder.toString();
    }
}
