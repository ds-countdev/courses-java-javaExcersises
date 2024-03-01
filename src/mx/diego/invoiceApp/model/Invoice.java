package mx.diego.invoiceApp.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Invoice {
    private int folio;
    private String description;
    private Date date;
    private Client client;
    private final ItemInvoice[] itemInvoice;
    private int itemIndex;
    private static int lastFolio;
    public static final int MAX_ITEMS = 100;

    public Invoice(String description, Client client){
        this.client = client;
        this.date = new Date();
        this.folio = ++lastFolio;
        this.description = description;
        this.itemInvoice = new ItemInvoice[MAX_ITEMS];
    }

    public int getFolio(){ return this.folio;}
    public String getDescription(){ return this.description;}
    public Date date(){return this.date;}
    public Client getClient(){return this.client;}
    public ItemInvoice[] getItemInvoice(){ return this.itemInvoice;}

    public void setDescription(String description) { this.description = description;}
    public void setClient(Client client) { this.client = client;}
    public void addItemInvoice(ItemInvoice itemInvoice) {
        if (itemIndex < MAX_ITEMS) this.itemInvoice[itemIndex++] = itemInvoice;
    }
    public float totalCalculate(){
        float total = 0.0f;
        for (ItemInvoice item : this.itemInvoice){
            if (Objects.isNull(item)) continue;
            total += item.importCalculate();
        }
        return total;
    }

    public String detailGenerate(){
        StringBuilder stringBuilder = new StringBuilder("Invoice No:");
        stringBuilder.append(folio)
                .append("\nClient: ")
                .append(this.client.getName())
                .append("\t NIF: ")
                .append(client.getNif())
                .append("\nDescription: ")
                .append(this.description)
                .append("\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'of' MMMM, yyyy");
        stringBuilder.append("emission date: ")
                .append(dateFormat.format(this.date))
                .append("\n")
                .append("\n#\tName\t$\tQuantity.\tTotal\n");

        itemInvoiceFor : for (ItemInvoice item : this.itemInvoice){
            if (item == null) continue itemInvoiceFor;

            stringBuilder.append(item);
        }

        stringBuilder.append("\n Final Total. ")
                .append(totalCalculate());



        return stringBuilder.toString();
    }

    @Override
    public String toString (){
        return detailGenerate();
    }
}
