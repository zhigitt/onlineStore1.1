import java.sql.SQLSyntaxErrorException;
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

//    Product[] products = {new Electronics(), new Book()};
    int countProduct = 0;

    public  void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println(STR."""
                1. Book
                2. Electrnics
                """);

        switch (sc.nextLine()){
            case "1":{
                Book book = new Book();
                book.addBook();
                break;
            }
            case "2":{
                Electronics electronic = new Electronics();
                electronic.addElectronics();
                break;
            }
        }
    }


    public void getAllProduct(){
        for (int i = 0; i < countProduct; i++) {

        }
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
