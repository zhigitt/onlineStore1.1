import java.util.Scanner;

public class Book extends Product{
    private String authorName;

    public Book(){}

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void addBook(){
        Book book = new Book();

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Prduct name: ");
        setName(sc.nextLine());

        System.out.println("Descraption: ");
        setDescription(sc.nextLine());

        System.out.println("Price: ");
        setPrice(sc1.nextInt());

        System.out.println("Craeted at: year ");
        setCreatedAt(sc1.nextInt());

        System.out.println("Author name: ");
        setAuthorName(sc.nextLine());
    }

    public static   void getAllBook(Product[] products) {
        for (Product bk : products) {
            if (bk instanceof Book) {
                System.out.println(bk);
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                '}' + super.toString();
    }
}
