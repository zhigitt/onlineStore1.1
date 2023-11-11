import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();

        Product product = new Product();

        Book book = new Book();

        Electronics electronics = new Electronics();

//        Electronics electronic = new Electronics();


        boolean found = false;

        while (true) {
            if (!found) {
                System.out.println("""
                        📑1. Register
                        🔐2. Login
                        💢3. Exit                    
                        """);
                System.out.print("Komnada tandanyz: ");
            } else {
                System.out.println("""
                        ❌0. Logout
                        ➕1. Add new product
                         ✔2. Get all Product
                        🟠3. Get all Book
                        💻4. Get all Electroics
                         """);

                System.out.println("Komanda tandoo: ");
            }
            if (!found) {
                switch (sc.nextLine()) {
                    case "1": {
                        user.register();
                        break;
                    }
                    case "2": {
                        found = true;
                        user.login();
                        break;
                    }
                    case "3": {
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("Komanda tuura emes berildi");
                    }
                }
            } else {
                switch (sc.nextLine()) {
                    case "0": {
                        found = false;
                        break;
                    }
                    case "1": {
                        product.addProduct();
                    }
                    case "2": {
                        product.getAllProduct();
                    }
                    case "3": {
                        book.getAllBook();
                    }
                    case "4": {
                        electronics.getAllElectrnics();
                    }
                    default: {
                        System.out.println("Komanda tuura emes berildi");
                    }
                }


            }
        }

    }
}