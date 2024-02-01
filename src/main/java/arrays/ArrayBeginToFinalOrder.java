package arrays;

public class ArrayBeginToFinalOrder {

    public static void main(String[] args) {

        int [] numbers = new int [10];
        int [] numbersTwo = new int [10];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        var aux = 0;
        for (int i = 0; i < (numbers.length - i); i++) {
            numbersTwo[aux ++] = numbers[i];
            numbersTwo[aux ++] = numbers[(numbers.length - 1) - i];
        }

        for (int number : numbersTwo)
            System.out.println(number);

    }
}
