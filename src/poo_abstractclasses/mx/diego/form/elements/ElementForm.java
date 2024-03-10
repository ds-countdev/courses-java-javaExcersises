package poo_abstractclasses.mx.diego.form.elements;

abstract public class ElementForm {

    protected String value;
    protected String name;

    public ElementForm(){}

    public ElementForm(String name){
        this();
        this.name = name;
    }

    public void setValue(String value) {this.name = value;}

    abstract public String drawHtml();
}
