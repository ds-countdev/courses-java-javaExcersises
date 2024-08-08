package java8.apistream;

import java8.models.Bill;
import java8.models.User;

import java.util.Arrays;

public class BillFlatMapExample {

    public static void main(String[] args) {

        var userOne = new User("Diego", "Rodriguez");
        var userTwo = new User("Alejandro", "Solano");

        userOne.addBill(new Bill("Cell purchase")).addBill(new Bill("Laptop purchase"));
        userTwo.addBill(new Bill("Candy purchase")).addBill(new Bill("Meat purchase"));

        Arrays.asList(userOne,userTwo).stream()
                .flatMap(user -> user.getBillList().stream())
                .forEach(bill -> System.out.println(bill.getDescription().concat(" made by : ").concat(bill.getUser().getName())));
    }
}
