package loop_control;

public class LoopsLabelsSentences {
    public static void main(String[] args) {

        loopOne : for(int i = 0; i < 5; i++) {
            System.out.println();
            loopTwo: for (int j = 0; j < 5; j++) {
                if (i == 3)
                    continue loopOne;
                System.out.println("[i = " + i + " j = " + j + "] ");
            }
        }
/////////////////////////////////////////Work days

        var i = (Integer) 1;
        loopOne : for(; i <= 12; i++) {

            var j = (Integer) 0;
            loopTwo: while (j <= 24) {

                System.out.println("Day :".concat(i.toString()).concat(" work hour :").concat(j.toString()));
                j ++;
                if (j >= 8 && j<=24) continue loopOne;
            }
        }
    }
}
