package java8.models;

public class Bill {

    private String description;
    private User user;

    public Bill(String description){
        this.description = description;
    }

    public String getDescription(){ return this.description;}

    public User getUser(){return this.user;}

    public void setDescription(String description){ this.description = description;}

    public void setUser(User user){ this.user = user;}


}
