package poo_interfaces.printing.model;

public class Page extends Sheet implements Printer{

    public Page(String content) {
        super(content);
    }

    @Override
    public String printer() {
        return this.content;
    }
}
