import java.time.LocalDate;
import java.util.Scanner;

public class Book extends Product{
    private String authorName;

    public Book(){}

    public Book(String name, String description, int price, int createdAt, String authorName) {
        super(name, description, price, createdAt);
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    Book[] books = new Book[20];
    int countBooks = 0;


    Product[] products = new Product[30];
    int countProduct = 0;

    public void addBook(){
        Book book = new Book();

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Prduct name: ");
        book.setName(sc.nextLine());

        System.out.println("Descraption: ");
        book.setDescription(sc.nextLine());

        System.out.println("Price: ");
        book.setPrice(sc1.nextInt());

        System.out.println("Craeted at: year ");
        book.setCreatedAt(sc1.nextInt());

        System.out.println("Author name: ");
        book.setAuthorName(sc.nextLine());

        products[countProduct] = book;
        countProduct++;

        books[countBooks] = book;
        countBooks++;
    }

    public void  getAllBook(){
        for (int i = 0; i < countBooks; i++) {
            System.out.println(books[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                '}' + super.toString();
    }
}
