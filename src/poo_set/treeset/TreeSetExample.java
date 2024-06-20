package poo_set.treeset;

import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        var treeSet = new TreeSet<String>((a,b) -> b.compareTo(a));
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        System.out.println(treeSet);

        var treeSetNum = new TreeSet<Integer>(Comparator.reverseOrder());

        treeSetNum.add(2);
        treeSetNum.add(1);
        treeSetNum.add(4);
        treeSetNum.add(5);
        treeSetNum.add(3);
        System.out.println("treeSetNum = " + treeSetNum);
        
    }
}
