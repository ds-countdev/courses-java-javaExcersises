package poo_generics.genericsclass;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Truck<T> implements Iterable<T>{

    private final List<T> objects;
    private final int max;

    public Truck (int max){
        this.max = max;
        this.objects = new ArrayList<>();
    }

    public Truck<T> add (T object){
        if (this.objects.size() <= max) this.objects.add(object);
        else throw new RuntimeException("theres not more space");
        return this;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return this.objects.iterator();
    }
}
