package mx.diego.invoiceApp.model;

public class ItemInvoice {

    private int quantity;
    private Product product;

    public ItemInvoice(int quantity, Product product){
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {return this.quantity;}
    public Product getProduct() {return this.product;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setProduct(Product product) {this.product = product;}
    public float importCalculate(){return this.quantity * this.product.getPrice();}

    @Override
    public String toString(){
        return product +
                "\t" + quantity +
                "\t" + importCalculate() +
                "\n";
    }
}
