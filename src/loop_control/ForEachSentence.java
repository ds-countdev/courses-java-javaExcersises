package loop_control;

public class ForEachSentence {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,9,11,13,14};

        for (var number : numbers)
            System.out.println("number = " + number);

        String[] names = {"diego","alejandro","marcos"};
        
        for (var name : names)
            System.out.println("name = " + name);


    }
}
