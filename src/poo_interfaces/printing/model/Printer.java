package poo_interfaces.printing.model;

public interface Printer {

    String DEFAULT_TEXT = "Default text";

    default String printer(){ return "Default text";}

    static void sheetPrinter(Printer sheet){
        System.out.println(sheet.printer());
    }
}
