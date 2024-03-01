package mx.diego.invoiceApp;

import mx.diego.invoiceApp.model.Client;
import mx.diego.invoiceApp.model.Invoice;
import mx.diego.invoiceApp.model.ItemInvoice;
import mx.diego.invoiceApp.model.Product;

import java.util.Scanner;

public class InvoiceExample {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var client = new Client("Diego","777-7");

        System.out.print("Insert invoice description :");
        var description = scanner.nextLine();
        Invoice invoice = new Invoice(description,client);

        System.out.println();

        Product product;
        int quantity;

        for (int i = 0; i < 2; i++) {
            product = new Product();
            System.out.print("Enter product name number " + product.getCode() + ": ");
            product.setName(scanner.nextLine());

            System.out.print("Enter product price: ");
            product.setPrice(scanner.nextFloat());

            System.out.print("Enter product quantity: ");
            quantity = scanner.nextInt();

            invoice.addItemInvoice(new ItemInvoice(quantity,product));

            System.out.println();
            scanner.nextLine();
        }
        System.out.println(invoice);

    }
}
