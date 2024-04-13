package poo_interfaces.printing.model;

abstract public class Sheet {

    protected String content;
    public Sheet(String content){ this.content = content; }

    abstract public String printer();

}
