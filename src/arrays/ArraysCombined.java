package arrays;

public class ArraysCombined {
    public static void main(String[] args) {

        int[] numbers = new int[12], numbersTwo = new int[12], numbersThree = new int[24];

        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1;

        for (int i = 0; i < numbersTwo.length; i++) numbersTwo[i] = (i+1) * 5;

        int aux = 0;
        for (int i = 0; i < numbersTwo.length; i+=3) {
            for (int j = 0; j < 3; j++) {
                numbersThree[aux++] = numbers[i+j];
            }
            for (int j = 0; j < 3; j++) {
                numbersThree[aux++] = numbersTwo[i+j];
            }
        }
        for (int number : numbersThree)
            System.out.println("number = " + number);

    }
}
