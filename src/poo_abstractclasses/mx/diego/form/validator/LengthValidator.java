package poo_abstractclasses.mx.diego.form.validator;

public class LengthValidator extends Validator{

    protected String message = "the field it should have less %d characters and max %d character";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LengthValidator () {};

    public LengthValidator (int min, int max){
        this.max = max;
        this.min = min;
    }

    public void setMax(int max) {this.max = max;}

    public void setMin(int min) {this.min = min;}

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
        this.message = String.format(this.message, this.min, this.max);
        if (value == null) return true;
        var lengthValue = value.length();
        return ( lengthValue >= min && lengthValue <= max );
    }
}
