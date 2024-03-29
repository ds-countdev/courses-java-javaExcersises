package poo_inheritance.mx.diego;

import java.util.Objects;

public class InheritanceExample {
    public static void main(String[] args) {

        System.out.println("====== initializing Student instance =========");
        Person student = new Student("Diego","Rodriguez",30,"diegoalejandro.solano@hotmail.com","TECNM");
        ((Student)student).setHistoryScore(10);
        ((Student)student).setMathScore(7.7f);

        System.out.println("====== initializing InternationalStudent instance =========");
        InternationalStudent internationalStudent =
                new InternationalStudent("Alejandr","Rodriguez",30,"diegoalejandro.solano@hotmail.com","TECNM", "Mexico");
        internationalStudent.setLanguagesScore(9.5);
        internationalStudent.setHistoryScore(9.5f);
        internationalStudent.setMathScore(9.8f);

        System.out.println("====== initializing Teacher instance =========");
        Teacher teacher = new Teacher();
        teacher.name = "Andres";
        teacher.setSignature("Mathematics");

        printClass(student);
        printClass(internationalStudent);

        Class className = internationalStudent.getClass();

        while (Objects.nonNull(className.getSuperclass())){
            var son = className.getSimpleName();
            var father = className.getSuperclass().getSimpleName();
            System.out.println(son.concat(" is a") + father +"'s son");
            className = className.getSuperclass();
        }
    }
    
    static void printClass(Object object)     {
        var title = "Hi ".concat(object.getClass().getSimpleName()).concat(((Person) object).name);
        title +=
                ", lastname: ".concat(((Person) object).lastName)
                + ", age " + ((Person) object).age
                + ", email " + ((Person) object).email;
                if (object instanceof Student){
                    title += ", institution ".concat(((Student) object).getInstitution());
                    title += ", history score: ".concat(String.valueOf(((Student) object).getHistoryScore()));
                    System.out.println("///////////// wave");
                    System.out.println(((Student) object).wave());
                    System.out.println("///////////// average");
                    System.out.println(((Student) object).average());
                    if (object instanceof InternationalStudent){
                        title += ", country".concat(((InternationalStudent) object).getCountry());
                        title += ", language score".concat(String.valueOf(((InternationalStudent) object).getLanguagesScore()));
                        System.out.println("///////////// wave");
                        System.out.println(((InternationalStudent) object).wave());
                        System.out.println("///////////// average");
                        System.out.println(((InternationalStudent) object).average());
                    }
                }
        System.out.println(title);
    }

}
