package poo_generics.genericsclass;

import static poo_generics.genericsclass.Types.HORSE;

public class TransportExample{

    public static void main(String[] args) {



        var horseTransport = new Truck<Animal>(3)
                .add(new Animal("Peregrine", HORSE))
                .add(new Animal("grillo", HORSE))
                .add(new Animal("Tuncan", HORSE))
                .add(new Animal("Spirit", HORSE));

        var machineryTransport = new Truck<Machinery>(2)
                .add(new Machinery("Gulldozer"))
                .add(new Machinery("mechanic arm"))
                .add(new Machinery("electric drill"));

        printTruck(horseTransport);
        printTruck(machineryTransport);


/*
        var carTransport = new Truck(2)
                .add(new Car("Ferrari"))
                .add(new Car("Lamborghini"))
                .add(new Car("Mitsubishi"));

        for (Object carObject : carTransport){
            var car = (Car) carObject;
            System.out.println(car.getCarBrand());
        }*/


    }

    static <T> void printTruck(Truck<T> truck){

        for ( T object : truck) {

            if (object instanceof Animal)
                System.out.println(((Animal) object).getName().concat(" is a ").concat( ((Animal) object).getType().name));

            else if (object instanceof Machinery) System.out.println("Transport a " + ((Machinery) object).getType());

            else if (object instanceof Car) System.out.println("Transport a " + ((Car) object).getCarBrand());

            else System.out.println("There's not transport");

            }
        }
    }
