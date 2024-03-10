package poo_abstractclasses.mx.diego.form.elements;

public class InputForm extends ElementForm{

    private String type = "text";

    public InputForm(String name){ super(name); }

    public InputForm(String name, String type){
        this(name);
        this.type = type;
    }

    public String getType() { return this.type;}

    public void setType(String type) { this.type = type; }

    @Override
    public String drawHtml() {
        return "<input type=\"" + this.type
                + "\" name=\"" + this.name
                + "\" value=\"" + this.value + "\">";
    }
}
