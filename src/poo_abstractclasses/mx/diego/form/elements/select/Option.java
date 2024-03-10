package poo_abstractclasses.mx.diego.form.elements.select;

import poo_abstractclasses.mx.diego.form.elements.SelectForm;

public class Option {

    private String name;
    private String value;
    private boolean isSelect;

    public Option(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelect() {return isSelect;}

    public void setSelect(boolean select) {isSelect = select;}

    public Option(String value, String name) {
        this.setName(name);
        this.setValue(value);
    }
}
