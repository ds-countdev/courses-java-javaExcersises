package java8.models;

public class Computer {

    private String name;
    private String model;

    private Processor processor;

    public Computer(String name, String model, Processor processor){
        this.name = name;
        this.model = model;
        this.processor = processor;
    }

    public String getName(){return this.name;}
    public String getModel(){return this.model;}

    public Processor getProcessor(){return this.processor;}

    public void setName(String name){this.name = name;}
    public void setModel(String model){this.model = model;}

    public void setProcessor(Processor processor){this.processor = processor;}

    @Override
    public String toString(){
        return name + ", " +model;
    }
}
