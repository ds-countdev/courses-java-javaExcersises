package arrays;

public class ArrayCombined {

    public static void main(String[] args) {

        int[] arrOne = new int[9], arrTwo = new int[9], arrThree = new int[18];

        for (int i = 0; i < arrOne.length ; i++) arrOne[i] = i + 1;
        for (int i = 0; i < arrTwo.length; i++) arrTwo[i] = (i + 1) * 5;

        var aux = 0;

        for (int i = 0; i < arrOne.length; i+=3){
            for (int j = 0; j < 3; j++) arrThree[aux++] = arrOne[i + j];
            for (int j = 0; j < 3; j++) arrThree[aux++] = arrTwo[i + j];
        }

        for (int num : arrThree) System.out.println(num);
    }
}
