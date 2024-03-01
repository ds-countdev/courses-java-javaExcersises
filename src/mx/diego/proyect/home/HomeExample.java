package mx.diego.proyect.home;

//import static mx.diego.proyect.home.HairColor.BLONDE;
import static mx.diego.proyect.home.Person.waving;
import mx.diego.proyect.home.HairColor;

public class HomeExample {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("diego");
        person.setHairColor(HairColor.BLONDE);

        System.out.println(waving());
        System.out.println(person);


    }
}
