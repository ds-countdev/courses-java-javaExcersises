package java8.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String surName;
    private int id;
    private static int lastId;

    private List<Bill> bills;

    public User(String name, String surName){
        this.name = name;
        this.surName = surName;
        this.id = ++lastId;
        this.bills = new ArrayList<>();
    }
    public void setName(String name){ this.name = name;}
    public String getName(){return this.name;}
    public String getSurName(){return this.surName;}
    public int getId(){return this.id;}
    public void setSurName(String surName){this.surName = surName;}

    public List<Bill> getBillList(){return this.bills;}
    public User addBill(Bill bill){
        this.bills.add(bill);
        bill.setUser(this);
        return this;
    }

    @Override
    public String toString(){
        return name +" "+ surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surName, user.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
