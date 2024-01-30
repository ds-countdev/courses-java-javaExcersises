package command_line;
public class CommandLineArguments {
    public static void main(String[] args) {

        if (args.length == 0)
            System.out.println("must to insert a name");

        loop : for (int i =0; i < args.length; i++)
            System.out.println("hello : " + args[i]);

    }
}
