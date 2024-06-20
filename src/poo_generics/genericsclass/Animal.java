package poo_generics.genericsclass;

import poo_generics.genericsclass.Types;

public class Animal {

    private final String name;
    private final Types type;

    public Animal( String name, Types type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

}
