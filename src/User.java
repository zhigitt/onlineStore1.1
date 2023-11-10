import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private  String password;
    private Product product;

    public User(){}

    public User(String firstName, String lastName, String email, String password, Product products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.product = products;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product products) {
        this.product = products;
    }


    public void register(User[] user) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        User user1 = new User();
        System.out.print("First name: ");
        user1.setFirstName(sc.nextLine());

        System.out.print("Last name: ");
        user1.setLastName(sc.nextLine());

        System.out.print("E-mail: ");
        user1.setEmail(sc.nextLine());

        System.out.print("Password: ");
        user1.setPassword(sc.nextLine());

        System.out.print("Kattaluuu iygiliktuuu boldu");


        user[count] = user1;
        count++;
        System.out.println(user[count -1].firstName);

    }

    public void login(User[] user){

        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        for (User us: user){
            if (us != null && us.getEmail().equals(login) && us.getPassword().equals(password)){
                System.out.println(STR."""
                                        Welcome
                                  User: \{us.getFirstName()} \{ us.getLastName()}
                                    """);
                System.out.println("""
                                    0. Logout
                                    1. Add new Product
                                    2. Get all Product
                                    3. Get all Book
                                    4. Get all Electroics
                                    """);

                System.out.println("Komanda tandoo: ");

                switch (sc.nextLine()){
                    case "0":{
                        break;
                    }
                    case "1":{
                        product.addProduct(product);
                    }
                    case "2":{

                    }

                }
            }
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", products='" + product + '\'' +
                '}';
    }
}
