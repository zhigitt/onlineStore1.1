import java.time.LocalDate;
import java.util.Scanner;

public class Electronics extends  Product{
    private  String brand;
    private  String color;
    private  String isNew;
    private  String memory;

    public Electronics(){}

    public Electronics(String name, String description, int price, int createdAt, String brand, String color, String isNew, String memory) {
        super(name, description, price, createdAt);
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

    Electronics[] onlyElectronics = new Electronics[30];
    int countElectronics = 0;


    Product[] products = new Product[30];
    int countProducs = 0;

    public void addElectronics(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Electronics electr = new Electronics();

        System.out.println("Prduct name: ");
        electr.setName(sc.nextLine());

        System.out.println("Descraption: ");
        electr.setDescription(sc.nextLine());

        System.out.println("Price: ");
        electr.setPrice(sc1.nextInt());

        System.out.println("Craeted at: year ");
        electr.setCreatedAt(sc1.nextInt());

        System.out.println("Brand: ");
        electr.setBrand(sc.nextLine());

        System.out.println("Color: ");
        electr.setColor(sc.nextLine());

        System.out.println("Is new: ");
        electr.setIsNew(sc.nextLine());

        System.out.println("Memory: ");
        electr.setMemory(sc.nextLine());


        onlyElectronics[countElectronics] = electr;
        countElectronics++;

        products[countProduct] = electr;
        countProduct++;

    }

    public void getAllElectrnics(){
        for (int i = 0; i < countElectronics; i++) {
            System.out.println(onlyElectronics[i].toString());
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
