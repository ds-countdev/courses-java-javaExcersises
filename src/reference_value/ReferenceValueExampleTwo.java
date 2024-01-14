package reference_value;

class Person{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String readName(){
        return this.name;
    }

}
public class ReferenceValueExampleTwo {

    public static void main(String[] args) {

        var person = new Person();
        person.setName("diego");
        System.out.println(person.readName());

        test(person);
        System.out.println("person = " + person.readName());


    }

    private static void test (Person person){
        person.setName("alejandro");
    }
}
