package poo;

import poo.entities.GasTank;
import poo.entities.Motor;
import poo.entities.MotorType;

public class CarInstanceEnumExample {
    public static void main(String[] args) {

        Car.setTankCapacityStatic(40);
        Car.setPatentColor(Color.ORANGE);
        Car subaru = new Car("Subaru","Impresa");
        subaru.setType(CarType.SPORT);
        subaru.setColor(Color.BLACK);
        subaru.setMotor(new Motor(3.5, MotorType.DIESEL));
        subaru.setGasTank(new GasTank());


        Car mazda = new Car("Mazda", "BT-50");
        mazda.setColor(Color.RED);
        mazda.setType(CarType.COUPE);
        mazda.setMotor(new Motor(3.0, MotorType.DIESEL));
        mazda.setGasTank(new GasTank(50));

        Car nissan = new Car("Nissan", "Versa",Color.BLUE, new Motor(3.5, MotorType.DIESEL), new GasTank(50));
        nissan.setType(CarType.SEDAN);
        Car ferrari = new Car("Ferrari", "f40", Color.WHITE);
        ferrari.setType(CarType.SPORT);

        CarType type = mazda.getType();
        System.out.println("mazda.getManufacturer() = " + mazda.getManufacturer());
        System.out.println("carType.getName() = " + type.getName());
        System.out.println("carType.getDescription() = " + type.getDescription());

        type = ferrari.getType();
        switch (type) {
            case SPORT:
                System.out.println("is sport");
                break;
            case COUPE:
                System.out.println("is coupe");
                break;
            case SEDAN:
                System.out.println("is sedan");
                break;
            case MINIVAN:
                System.out.println("is minivan");
                break;
            case PICK_UP:
                System.out.println("is pick up");
                break;
        }

        CarType[] carTypes =  CarType.values();
        for (CarType carType : carTypes) {
            System.out.println(" CarType : " + "=> " + carType.name() + ", " +
                    carType.getName() + ", " +
                    carType.getDescription() + ", " +
                    carType.getDoors());

            System.out.println();
        }

        GasTank gas = new GasTank(50);
        System.out.println("gas.getCapacity() = " + gas.getCapacity());
    }


}
