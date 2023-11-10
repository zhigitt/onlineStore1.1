import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[10];
        Product[] products = new Product[80];

        User user1 = new User();
        Product product = new Product();


        while (true) {
            System.out.println("""
                    1. Register
                    2. Login
                    3. Exit                    
                    """);
            System.out.print("Komnada tndanyz: ");

            switch (sc.nextLine()){
                case "1":{
                    user1.register(users);
                    System.out.println(Arrays.toString(users));

                    break;
                }
                case "2":{
                    while (true){
                    user1.login(users);
                    break;
                    }
                }
                case "3":{
                    System.out.println();
                }
            }


        }
    }

}