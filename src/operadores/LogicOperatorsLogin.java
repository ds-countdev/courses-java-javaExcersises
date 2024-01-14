package operadores;

import java.util.Scanner;

public class LogicOperatorsLogin {

    public static void main(String[] args) {

        final StringBuilder[] usernames = {
                new StringBuilder("diego"),
                new StringBuilder("uly"),
                new StringBuilder("deniss")
        };
        final StringBuilder[] passwords = {
                new StringBuilder("123"),
                new StringBuilder("321"),
                new StringBuilder("111")
        };

        System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username :");
        String inStringUsername = scanner.next();
        System.out.println("Enter value in :".concat(String.valueOf(System.currentTimeMillis())));

        System.out.println("Enter password :");
        String inStringPassword = scanner.next();
        System.out.println("Entrada:".concat(String.valueOf(System.currentTimeMillis())));

        boolean isAuthenticated = false;

        for(int i = 0 ; i < usernames.length ; i++)
            if (usernames[i].toString().equals(inStringUsername) &&
                    passwords[i].toString().equals(inStringPassword)) {
                isAuthenticated = true;
                break;
            }

        /*if(isAuthenticated)
            System.out.println("Welcome ".concat(usernames[0].toString()).concat("!"));
        else System.out.println("try again!");*/

        var message = isAuthenticated ? "Welcome ".concat(inStringUsername).concat("!")
                : "try again";
        System.out.println(message);

    }
}
