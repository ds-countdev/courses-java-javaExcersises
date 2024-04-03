package poo_abstractclasses.mx.diego.form.validator;

public class NumberValidator extends Validator{

    protected String message = "It must be a number";

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
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException exception) {
            return false;
        }
    }
}
