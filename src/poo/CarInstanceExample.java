package poo;

import poo.entities.GasTank;
import poo.entities.Motor;
import poo.entities.MotorType;

public class CarInstanceExample {
    public static void main(String[] args) {

        Car subaru = new Car();
        subaru.setManufacturer("Subaru");
        subaru.setModel("Impresa");
        subaru.setColor(Color.RED);
        subaru.setType(CarType.SPORT);
        subaru.setMotor(new Motor(3.5, MotorType.DIESEL));
        subaru.setGasTank(new GasTank());

        Car mazda = new Car();
        mazda.setManufacturer("Mazda");
        mazda.setModel("BT-50");
        mazda.setType(CarType.COUPE);
        mazda.setColor(Color.BLACK);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        mazda.setGasTank(new GasTank(50));

        Motor nissanMotor = new Motor(3.5, MotorType.DIESEL);
        GasTank gasTank = new GasTank(50);
        Car nissan = new Car("Nissan", "Versa", Color.BLUE, nissanMotor, gasTank);
        Car nissanTwo = new Car("Nissan", "Versa", Color.WHITE, nissanMotor, gasTank);
        Car ferrari = new Car();

        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());
        System.out.println(subaru.speedUp(300));
        System.out.println(subaru.brake());
        System.out.println(mazda.accelerateAndBrake(300));
        System.out.println("are equals " + (nissan.equals(nissanTwo)));
        System.out.println("are equals with custom equals " + nissan.equals(nissanTwo));
        System.out.println("are equals with custom equals " + ferrari.equals(nissanTwo));
        System.out.println(nissan.toString());
        System.out.println(nissan);
        System.out.println("kilometers by litter : "
                .concat(String.valueOf(mazda.gasolineCalculate(200, 0.75f))));
        System.out.println("kilometers by litter : "
                .concat(String.valueOf(subaru.gasolineCalculate(200, 75))));
        System.out.println("kilometers by litter : "
                .concat(String.valueOf(nissan.gasolineCalculate(200, 75))));



    }


}
