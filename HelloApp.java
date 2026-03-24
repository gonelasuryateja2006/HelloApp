public class HelloApp {
    public static void main(String[] args) {
        String name = "Surya";
        if(args.length > 0) {
        name = args[0]  ;
        }
        name = name.toUpperCase();
        System.out.println("Hello," + name + "!");
    }
}