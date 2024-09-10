package java8.models;

public class Processor {

    private String name;
    private String manufacturer;

    public Processor(String name, String manufacturer){
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName(){return this.name;}
    public String getManufacturer(){return this.manufacturer;}
    public void setName(String name){this.name = name;}
    public void setManufacturer(String Manufacturer){this.manufacturer = manufacturer;}
}
