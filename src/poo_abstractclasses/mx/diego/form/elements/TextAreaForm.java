package poo_abstractclasses.mx.diego.form.elements;

public class TextAreaForm extends ElementForm {

    private int rows;
    private int columns;

    public TextAreaForm(String name){ super(name);}
    public TextAreaForm(String name, int rows, int columns){
        this(name);
        this.rows = rows;
        this.columns = columns;
    }
    public int getRows(){ return this.rows;}
    public int getColumns() { return this.columns;}

    public void setRows(int rows) { this.rows = rows;}
    public void setColumns(int coulumns) {this.columns = coulumns;}

    @Override
    public String drawHtml() {
        return "<textarea name='" + this.name + "' cols='" +
                this.columns + "' rows='" + this.rows + "'>"
                + this.value + "</textarea>";
    }
}
