package poo;

import poo.entities.GasTank;
import poo.entities.Motor;
import poo.entities.MotorType;

public class CarInstanceStaticExample {
    public static void main(String[] args) {

        Car subaru = new Car();
        subaru.setManufacturer("Subaru");
        subaru.setModel("Impresa");
        subaru.setType(CarType.SPORT);
        subaru.setColor(Color.BLACK);
        subaru.setMotor(new Motor(3.5, MotorType.DIESEL));
        subaru.setGasTank(new GasTank());

        Car mazda = new Car();
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setColor(Color.RED);
        mazda.setType(CarType.COUPE);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        mazda.setGasTank(new GasTank(50));

        Car nissan = new Car("Nissan", "Versa",Color.BLUE, new Motor(3.5, MotorType.DIESEL), new GasTank(50));
        nissan.setType(CarType.SEDAN);
        Car ferrari = new Car("Ferrari", "f40", Color.WHITE, new Motor(3.5, MotorType.DIESEL), new GasTank(50));
        ferrari.setType(CarType.SPORT);
        Car.setPatentColor(Color.ORANGE);

        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());
        System.out.println(ferrari.detail());
        System.out.println(ferrari);

        System.out.println(Car.gasolineCalculateStatic(20,3.4f));
        System.out.println(subaru.gasolineCalculate(200,50));
        System.out.println(Car.HIGHWAY_MAX_VELOCITY);
        System.out.println(Car.CITY_MAX_VELOCITY);

    }


}
