package mx.diego.proyect.home;

enum HairColor {
    BLONDE("blonde"), BLACK("black"), BLUE("blue"), BROWN("brown");

    final String color;

    HairColor(String color){ this.color = color;}

    public String getColor() {return this.color;}
}
