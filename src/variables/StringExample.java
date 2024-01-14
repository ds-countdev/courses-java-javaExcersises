package variables;

public class StringExample {

    public static void main(String[] args) {

        String course = "Java Programming";
        String courseTwo = new String("Java Programming");

        boolean isEquals = course == courseTwo;
        System.out.println("course == courseTwo:" +isEquals);

        isEquals = course.equalsIgnoreCase(courseTwo);
        System.out.println("course.IgnoreCase:"+ isEquals);

        String courseThree = course;
        isEquals = courseThree == course;
        System.out.println("courseThree = course:" + isEquals);


    }
}
