package poo.entities;

public class Person {

    private String name;
    private String lastName;
    private String emailAddress;

    Person(){};
    public Person(String name){ this.name = name;}
    public Person(String name, String lastName){
        this(name);
        this.lastName = lastName;
    }
    public Person(String name, String lastName, String emailAddress){
        this(name, lastName);
        this.emailAddress = emailAddress;
    }

    public String getName(){return this.name;}
    public String getLastName(){ return this.lastName;}
    public String getEmailAddress(){return this.emailAddress;}

    public void setName(String name){this.name = name;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setEmailAddress(String emailAddress){this.emailAddress = emailAddress;}

    @Override
    public String toString() {
        return name.concat(lastName) + "emailAddress = '" + emailAddress;
    }
}
