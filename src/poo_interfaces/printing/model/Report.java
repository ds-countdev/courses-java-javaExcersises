package poo_interfaces.printing.model;

public class Report extends Sheet implements Printer{

    private Person author;
    private Person reviewer;

    public Report(String content, Person reviewer, Person author) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String printer() {
        return "reporter wrote by: " + author +
                " reviewed by: " + reviewer +
                "\n" + this.content;
    }
}
