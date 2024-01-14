package variables;

public class StringValidationExample {

    public static void main(String[] args) {

        String course = null;

        if(course == null) course = "Java Programming";

        //if(course.length() != 0)
           // System.out.println("Welcome to course".concat(course));
        if(!course.isEmpty())
            System.out.println("Welcome to course".concat(" ").concat(course));
        if(!course.isBlank())
            System.out.println("Welcome to course".concat(course));


    }
}
