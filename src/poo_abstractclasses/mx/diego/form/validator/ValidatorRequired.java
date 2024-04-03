package poo_abstractclasses.mx.diego.form.validator;

public class ValidatorRequired extends Validator{

    protected  String message = "this field is required";

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && value.length() > 0);
    }
}
