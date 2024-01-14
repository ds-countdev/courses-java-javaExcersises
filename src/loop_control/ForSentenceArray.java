package loop_control;

import javax.swing.*;

public class ForSentenceArray {
    public static void main(String[] args) {

        String [] names = {"diego","maria","karla","estefania","alan"};
        var arraySize = names.length;
        for (int i = 0; i < arraySize; i++) {
            if (names[i].equalsIgnoreCase("diego") || names[i].equalsIgnoreCase("karla"))
                continue;
                System.out.println(names[i]);
        }

        String name = JOptionPane.showInputDialog("Input a name");
        var founded = false;

        for(int i =0 ; i < arraySize ; i++)
            if (names[i].equalsIgnoreCase(name)){
                founded = true;
                break;
            }

        if (founded)
            System.out.println(name.concat(" was found"));
        else System.out.println(name.concat( " was not found"));

    }
}
