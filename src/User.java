import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Product product;

    public User() {
    }

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


    User[] user = new User[10];
    int count = 0;

    public void register() {
            User user1 = new User();

            Scanner sc = new Scanner(System.in);

            System.out.print("First name: ");
            user1.setFirstName(sc.nextLine());

            System.out.print("Last name: ");
            user1.setLastName(sc.nextLine());

            System.out.print("E-mail: ");
            user1.setEmail(sc.nextLine());

            System.out.print("Password: ");
            user1.setPassword(sc.nextLine());

            System.out.print("Kattaluuu iygiliktuuu boldu ");


            user[count] = user1;
            count++;
            System.out.println(" ");
    }


    public void login() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (user[i].getEmail().equals(login) && user[i].getPassword().equals(password)) {
                System.out.println(STR. """
                                        Welcome
                                  👤User: \{ user[i].getFirstName() } \{ user[i].getLastName() }
                                    """ );

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

