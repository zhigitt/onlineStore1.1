import java.util.Scanner;

public class Electronics extends  Product{
    private  String brand;
    private  String color;
    private  String isNew;
    private  String memory;

    public Electronics(){}
    public Electronics(String name, String description, int price, int createdAt, int countProduct, Product[] products, String brand, String color, String isNew, String memory) {
        super(name, description, price, createdAt, countProduct, products);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void addElectronics(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Electronics electronic = new Electronics();

        System.out.println("Prduct name: ");
        setName(sc.nextLine());

        System.out.println("Descraption: ");
        setDescription(sc.nextLine());

        System.out.println("Price: ");
        setPrice(sc1.nextInt());

        System.out.println("Craeted at: year ");
        setCreatedAt(sc1.nextInt());

        System.out.println("Brand: ");
        setBrand(sc.nextLine());

        System.out.println("Color: ");
        setColor(sc.nextLine());

        System.out.println("Is new: ");
        setIsNew(sc.nextLine());

        System.out.println("Memory: ");
        setMemory(sc.nextLine());
    }

    public static void getAllElectrnics(Product[] products) {
        for (Product El : products) {
            if (El instanceof Electronics) {
                System.out.println(El);
            }
        }
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew='" + isNew + '\'' +
                ", memory='" + memory + '\'' +
                '}' + super.toString();
    }
}
