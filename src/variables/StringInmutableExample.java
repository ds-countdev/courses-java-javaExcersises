package variables;

public class StringInmutableExample {

    public static void main(String[] args) {

        String course = "Java 11 Programming Class";
        String teacher = "Diego Rodriguez";

        String result = course.concat(" by ").concat(teacher);
        System.out.println(result);

        String result2 = course.toUpperCase()
                .replace("Java 11".toUpperCase(),"JavaScript")
                .toLowerCase()
                .concat(" by ")
                .concat(teacher);
        System.out.println(result2);
    }
}
