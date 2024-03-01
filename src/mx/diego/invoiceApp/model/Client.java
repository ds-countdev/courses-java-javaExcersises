package mx.diego.invoiceApp.model;

public class Client {
    private String name;
    private String nif;

    public Client(String name, String nif){
        this.name = name;
        this.nif = nif;
    }
    public String getName(){ return this.name;}
    public String getNif(){return this.nif;}

    public void setName(String name){ this.name = name;}
    public void setNif(String nif){this.nif = nif;}
}
