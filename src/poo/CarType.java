package poo;

public enum CarType {
    SEDAN("Sedan", "Standar Car", 4),
    STATION_WAGON("Station Wagon", "Large Car", 4),
    HATCH_BACK("Hatch Back", "Small Sedan Car", 4),
    PICK_UP("Pick Up", "Truck", 6),
    COUPE("Coupe", "Sport Elegant Car", 2),
    SPORT("Sport", "Sport Car", 2),
    MINIVAN("Mini Van", "Large Mini Van", 3),
    SUV("SUV", "Off Road", 5);

    private final String name;
    private final String description;
    private final int doors;

    CarType(String name, String description, int doors){
        this.name = name;
        this.description = description;
        this.doors = doors;
    }

    public String getName(){return this.name;}
    public String getDescription(){return this.description;}
    public int getDoors(){return this.doors;}


}
