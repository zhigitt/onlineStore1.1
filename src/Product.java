import java.util.Arrays;
import java.util.Scanner;

public class Product {
    private String name;
    private String description;
    private int price;
    private int createdAt;
    protected int countProduct = 0;

    protected Product[] products = new Product[30];

    public Product() {
    }

    public Product(String name, String description, int price, int createdAt, int countProduct, Product[] products) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.countProduct = countProduct;
        this.products = products;
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

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }


    public void addProduct() {
        Book book = new Book();
        Electronics electronic = new Electronics();

        Scanner sc = new Scanner(System.in);
        System.out.println(STR."""
                1. Book
                2. Electrnics
                """);

        switch (sc.nextLine()) {
            case "1": {
                book.addBook();
                products[countProduct] = book;
                countProduct++;
                break;
            }
            case "2": {
                electronic.addElectronics();
                products[countProduct] = electronic;
                countProduct++;
                break;
            }
        }
    }


    public void getAllProduct() {
        for (int i = 0; i < countProduct; i++) {
            System.out.println(products[i].toString());
        }
    }

    public Product[] getAll(){
      return  Arrays.copyOf(products, countProduct);
    }

    public Product[] getAll1(){
        return Arrays.copyOf(products, countProduct);
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
