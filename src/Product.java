import java.time.LocalDate;
import java.util.Scanner;

import static java.time.LocalDate.*;

public class Product {
    private  String name;
    private  String description;
    private  int price;
    private int createdAt;

    public Product(){}
    public Product(String name, String description, int price, int createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public  void addProduct(Product product){
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();

        System.out.println("Prduct name: ");
        product1.setName(sc.nextLine());

        System.out.println("Descraption: ");
        product1.setDescription(sc.nextLine());

        System.out.println("Price: ");
        product1.setPrice(sc.nextInt());

        System.out.println("Craeted at: year ");
        product1.setCreatedAt(sc.nextInt());



    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", createdAt=" + createdAt +
                '}';
    }
}
