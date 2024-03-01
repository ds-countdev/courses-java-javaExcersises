package poo.entities;

public class Tires {

    private final String manufacturer;
    private final int rin;
    private final double width;

    public Tires(String manufacturer, int rin, double width){
        this.manufacturer = manufacturer;
        this.rin = rin;
        this.width = width;
    }

    public String getManufacturer(){ return this.manufacturer;}
    public String getRin(){ return String.valueOf(this.rin);}
    public String getWidth(){ return String.valueOf(this.width);}
}
