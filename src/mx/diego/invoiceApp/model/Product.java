package mx.diego.invoiceApp.model;

public class Product {
    private int code;
    private String name;
    private float price;
    private static int lastCode;

    public Product() {this.code = ++lastCode;}

    public int getCode(){ return this.code;}
    public String getName(){ return this.name;}
    public float getPrice(){ return this.price;}

    public void setName(String name) {this.name = name;}
    public void setPrice(float price) {this.price = price;}

    @Override
    public String toString() {
        return code +
                "\t" + name +
                "\t" + price;
    }
}
