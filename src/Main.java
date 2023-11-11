import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        User user = new User();

        Book book = new Book();


        boolean found = false;

        while (true) {
            if (!found) {
                System.out.println("""
                        1. Register
                        2. Login
                        3. Exit                    
                        """);
                System.out.print("Komnada tandanyz: ");
            } else {
                System.out.println("""
                        0. Logout
                        1. Add new book
                        2. Add new electronics
                        3. Get all Product
                        4. Get all Book
                        5. Get all Electroics
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
                        user.displayUsers();
                    }
                }
            } else {
                switch (sc.nextLine()) {
                    case "0": {
                        break;
                    }
                    case "1": {
                        book.addBook();
                    }
                    case "2": {
//                        product.getAllProduct();
                    }
                    case "3":{

                    }
                    case "4":{
                        book.getAllBook();
                    }
                }


            }
        }

    }
}