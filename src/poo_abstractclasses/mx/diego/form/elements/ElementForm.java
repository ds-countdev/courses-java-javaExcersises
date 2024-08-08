package poo_abstractclasses.mx.diego.form.elements;

import poo_abstractclasses.mx.diego.form.validator.Validator;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementForm {

    protected String value;
    protected String name;

    private final List<Validator> validators;
    private final List<String> errors;

    public ElementForm(){
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementForm(String name){
        this();
        this.name = name;
    }

    public ElementForm addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors(){
        return errors;
    }

    public void setValue(String value) {this.name = value;}

    public boolean isValid(){
        for (Validator validator : this.validators)
            if (!validator.isValid(this.value)) this.errors.add(validator.getMessage());
        return this.errors.isEmpty();
    }

    abstract public String drawHtml();
}
