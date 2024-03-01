package poo;

import poo.entities.GasTank;
import poo.entities.Motor;
import poo.entities.Person;
import poo.entities.Tires;

import java.util.Objects;

public class Car implements Comparable{

    private int id;
    private String manufacturer;
    private String model;
    private Color color;
    private Motor motor;
    private GasTank gasTank;
    private Person driver;
    private Tires[] tires;
    private CarType type;

    private static Color patentColor = Color.ORANGE;
    private static int tankCapacityStatic = 30;
    private static int lastId;

    public static final int HIGHWAY_MAX_VELOCITY = 100;
    public static final int CITY_MAX_VELOCITY = 80;

    public static final String RED_COLOR = "Red";
    public static final String BLUE_COLOR = "Blue";
    public static final String GRAY_COLOR = "Gray";

    public Car(){ this.id = ++lastId;}

    public Car(String manufacturer, String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public Car(String manufacturer, String model, Color color) {
        this(manufacturer, model);
        this.color = color;
    }
    public Car(String manufacturer, String model, Color color, Motor motor) {
        this(manufacturer, model, color);
        this.motor = motor;
    }
    public Car(String manufacturer, String model, Color color, Motor motor, GasTank gasTank) {
        this(manufacturer, model, color, motor);
        this.gasTank = gasTank;
    }

    public Car(String manufacturer, String model, Color color, Motor motor, GasTank gasTank, Person driver, Tires[] tires, CarType type) {
        this(manufacturer, model, color, motor, gasTank);
        this.driver = driver;
        this.tires = tires;
        this.type = type;
    }

    public String getManufacturer() {return this.manufacturer;}
    public String getModel() { return this.model;}
    public Color getColor() {return  this.color;}
    public Motor getMotor() {return this.motor;}
    public GasTank getGasTank() {
        if (Objects.isNull(this.gasTank))
            return new GasTank();
        return this.gasTank;
    }
    public Person getDriver() {return this.driver;}
    public Tires[] getTires() {return this.tires;}
    public CarType getType(){return this.type;}
    public static Color getPatentColor(){ return patentColor;}
    public static int getTankCapacityStatic(){ return tankCapacityStatic;}
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public void setModel(String model) { this.model = model;}
    public void setColor(Color color) { this.color = color;}
    public void setMotor(Motor motor) {this.motor = motor;}
    public void setGasTank(GasTank gasTank) {this.gasTank = gasTank;}
    public void setPerson( Person driver) { this.driver = driver;}
    public void setTires(Tires[] tires) {this.tires = tires;}
    public void setType(CarType type){this.type = type;}
    public static void setPatentColor(Color patentColor) { Car.patentColor = patentColor;}
    public static void setTankCapacityStatic(int tankCapacity) {Car.tankCapacityStatic = tankCapacity;}

    public String detail(){
        StringBuilder detail = new StringBuilder();
        detail = new StringBuilder("id = " + this.id +
                "\nmanufacturer = " + this.getManufacturer() +
                "\nmodel = " + this.getModel());
                if (Objects.nonNull(this.getType())) detail.append("\ntype = ").append(this.getType().getDescription());
                detail.append("\ncolor = ").append(this.color).append("\npatentColor = ").append(patentColor);
                if (Objects.nonNull(this.getMotor())) detail.append("\ncylinder = ").append(this.motor.getCylinder());
                if (Objects.nonNull(this.getDriver())) detail.append("\n")
                        .append(this.manufacturer.concat("driver = ")).append(this.getDriver().getName());
                if (Objects.nonNull(this.getTires()))
                    for (Tires tire : tires) detail.append("\n").append(tire.getManufacturer())
                            .append(", rin: ".concat(tire.getRin())).append(", width: ".concat(tire.getWidth()));
                return detail.toString();
    }

    public String speedUp(int rpm){
        return "the ".concat(this.manufacturer).concat(" speed is ")
                .concat(String.valueOf(rpm)).concat(" rpm");
    }

    public String brake(){
        return this.manufacturer.concat(" ").concat(this.model).concat(" breaking!!!");
    }

    public String accelerateAndBrake(int rpm){
        String accelerate = this.speedUp(rpm);
        String brake = this.brake();
        return accelerate.concat("\n").concat(brake);
    }

    public float gasolineCalculate(int km, float gasPercent){
        return km/(this.gasTank.getCapacity() *gasPercent);
    }

    public static float gasolineCalculateStatic(int km, float gasPercent){

        return km/(tankCapacityStatic *gasPercent);
    }
    public float gasolineCalculate(int km, int gasPercent){
        return km/(this.gasTank.getCapacity() *(gasPercent / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else if (!(obj instanceof Car)) return false;
        else if (Objects.isNull(this.manufacturer) && Objects.isNull(this.model)) return false;
        else {
            Car car = (Car) obj;
            return (this.manufacturer.equals(car.manufacturer) && this.model.equals(car.model));
        }
    }

    @Override
    public String toString() {
        StringBuilder carBuilder = new StringBuilder("Car {".concat(String.valueOf(this.id)));
        return carBuilder.append(", ")
                .append(this.manufacturer).append(", ")
                .append(this.model).append(" }")
                .toString();
    }

    @Override
    public int compareTo(Object o) {
        var car = (Car) o;
        return this.manufacturer.compareTo(car.manufacturer);
    }
}
