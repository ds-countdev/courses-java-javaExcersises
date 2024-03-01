package poo;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    ORANGE("Orange"),
    BLACK("Black"),
    WHITE("White");

    private final String color;

    Color(String color){
        this.color = color;
    }
    @Override
    public String toString() {
        return this.color;
    }
}
