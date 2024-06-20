package poo_set.hashset;

import poo_generics.exceptions.OutBoundErrorExcpetion;

import java.util.Collections;
import java.util.HashSet;

public class HashSetMethods {

    @SafeVarargs
    public static <T> HashSet<T> hashSetCreate (T... object) {
        var hashSet = new HashSet<T>();
        try {
            Collections.addAll(hashSet, object);
        }catch (Exception excpetion){
            System.out.println("An error happens when try to add on hashSet");
        }
        return hashSet;
    }
}
