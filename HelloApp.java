public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello,SURYA!");
        } else {
            for (int i = 0; i < args.length; i++) {
                String name = args[i];
                System.out.println("hello," + name + "!");
            }
        }
    }
}