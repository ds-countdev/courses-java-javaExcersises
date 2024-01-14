package variables;

public class StringConcatExample {
    public static void main(String[] args) {

        var course = "Java Programming";
        var teacher = "Diego Rodriguez";

        var detail = course.concat(" by ").concat(teacher);
        System.out.println(detail);
    }
}
