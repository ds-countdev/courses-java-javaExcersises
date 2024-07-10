package java8.models;

public class User {

    private String name;
    private String surName;
    private int id;
    private static int lastId;

    public User(String name, String surName){
        this.name = name;
        this.surName = surName;
        this.id = ++lastId;
    }
    public void setName(String name){ this.name = name;}
    public String getName(){return this.name;}
    public String getSurName(){return this.surName;}
    public int getId(){return this.id;}
    public void setSurName(String surName){this.surName = surName;}

    @Override
    public String toString(){
        return name +" "+ surName;
    }
}
