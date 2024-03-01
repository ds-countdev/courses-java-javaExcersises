package poo.entities;

public class GasTank {

    private final int capacity;

    public GasTank(){ this.capacity = 40;}
    public GasTank(int capacity){this.capacity = capacity;}

    public int getCapacity(){return this.capacity;}

}
