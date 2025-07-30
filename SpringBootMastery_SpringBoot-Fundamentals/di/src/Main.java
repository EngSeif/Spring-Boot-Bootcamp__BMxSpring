public class Main {
    public static void main(String[] args) {

        // <--- Constructor Injection --->

        Printer printer = new Printer();
        UserService userService = new UserService(printer);
        userService.usePrinter("Hello World From Constructor Injection");

        // <--- Setter Injection --->
        UserService userService2 = new UserService();
        Printer printer2 = new Printer();
        userService2.setPrinter(printer2);
        userService.usePrinter("Hello World From Setter Injection");
    }
}