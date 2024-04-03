package poo_abstractclasses.mx.diego.form.validator;

public class NotNull extends Validator{

    protected String message = "this field couldn't be null";

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
        return (value != null);
    }
}
