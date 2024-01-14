package loop_control;

public class LoopsLabelsSentenceFind {

    public static void main(String[] args) {

        var phrase = "tres tristes tigres tragaban trigo en un trigal";
        var word = "tresh";

        var wordSize = word.length();
        var phraseSize = phrase.length() - wordSize;
        var lettersFound = 0;

        loopOne: for (int i= 0;i < phraseSize ;){
            var k = i;
            loopTwo : for (int j =0 ; j< wordSize; j++)
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue loopOne;
                }
            lettersFound++;
                i = i + wordSize;
        }
        System.out.println("words Found = " + lettersFound);

    }
}
