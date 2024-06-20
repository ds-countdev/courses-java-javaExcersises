package poo_interfaces.model;

public class BaseEntity {

    int idClient;

    private static int lastId;

    BaseEntity(){
        this.idClient = ++ lastId;
    }

    public int getIdClient() {
        return idClient;
    }
}
