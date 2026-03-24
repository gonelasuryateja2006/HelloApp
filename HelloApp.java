public class OOPSHelloAppCommaSeparated {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello,SURYA!");
        } else {
            String commaSeparatedNames = String.join(",", args);
            System.out.println("Hello," + commaSeparatedNames + "!");
        }
    }
}