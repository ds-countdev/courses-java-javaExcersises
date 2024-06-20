package poo_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class findDuplicateExample{
    public static void main(String[] args) {

        String[] arr = {"Corvina", "Lenguado", "Robalo", "Atun", "Lenguado"};

        var hashSet = new HashSet<String>(List.of(arr));

        hashSet.remove("Atun");


        System.out.println(hashSet);

    }
}
