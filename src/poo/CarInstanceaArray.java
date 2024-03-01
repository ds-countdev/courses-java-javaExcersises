package poo;

import poo.entities.GasTank;
import poo.entities.Motor;
import poo.entities.MotorType;
import poo.entities.Person;
import poo.entities.Tires;

import java.util.Arrays;

public class CarInstanceaArray {
    public static void main(String[] args) {

        Car subaru = new Car();
        Tires[] tires = new Tires[5];
        for (int i = 0; i < tires.length; i++) tires[i] = new Tires("yokohama", 18,18);

        Person subaruDriver = new Person("diego","rodriguez","dieguito@hotmail.com");
        subaru.setManufacturer("Subaru");
        subaru.setModel("Impresa");
        subaru.setType(CarType.SPORT);
        subaru.setColor(Color.BLACK);
        subaru.setMotor(new Motor(3.5, MotorType.DIESEL));
        subaru.setGasTank(new GasTank());
        subaru.setTires(tires);

        Car mazda = new Car();

        for (int i = 0; i < tires.length; i++) tires[i] = new Tires("Michelin", 14, 14);
        Person mazdaPerson = new Person("Alejandro", "solano", "alejandro@gmail.com");
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setColor(Color.RED);
        mazda.setType(CarType.COUPE);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        mazda.setGasTank(new GasTank(50));

        Person nissanDriver = new Person("Jhon", "Doe", "jhon@hotmail.com");
        for (int i = 0; i < tires.length; i++) tires[i] = new Tires("Pirelli", 16, 16);
        Car nissan = new Car("Nissan", "Versa",Color.BLUE, new Motor(3.5, MotorType.DIESEL), new GasTank(50), nissanDriver,tires,null);
        nissan.setType(CarType.SEDAN);

        Car suzuki = new Car("Suzuki", "Vitara",Color.ORANGE);
        suzuki.setPerson(new Person("Diego", "Perez", "diegop@hotmai.com"));
        suzuki.setType(CarType.SUV);
        suzuki.setGasTank(new GasTank(50));

        Car audi = new Car("Audi", "A3", Color.RED);
        audi.setPerson(new Person("Diego", "Perez", "diegop@hotmai.com"));
        audi.setType(CarType.SPORT);
        audi.setGasTank(new GasTank(50));
        Car[] cars = {subaru, mazda, nissan, suzuki, audi};
        Arrays.sort(cars);
        for (Car car : cars) System.out.println(car);



    }


}
