package variables;

public class ExtensionFileExample {

    public static void main(String[] args) {
        String file = "image.pdf";
        int position = file.lastIndexOf('.');
        System.out.println("File type = ".concat(file.substring(position+1,file.length())));

    }
}
