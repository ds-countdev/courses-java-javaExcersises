package poo_generics.genericsclass;

enum Types {

    HORSE("Horse"),
    FERRARI("Ferrari"),
    LAMBORGHINI("Lamborghini");

    final String name;

    Types(String name){this.name = name;}

    @Override
    public String toString() {return this.name;}
}
