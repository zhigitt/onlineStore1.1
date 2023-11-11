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

    Book[] books = new Book[30];
    int countBook = 0;

    public void addBook(){
        Book book = new Book();

        Scanner sc = new Scanner(System.in);

        System.out.println("Prduct name: ");
        book.setName(sc.nextLine());

        System.out.println("Descraption: ");
        book.setDescription(sc.nextLine());

        System.out.println("Price: ");
        book.setPrice(sc.nextInt());

        System.out.println("Craeted at: year ");
        book.setCreatedAt(sc.nextInt());

        System.out.println("Author name: ");
        book.setAuthorName(sc.nextLine());

        books[countBook] = book;
        countBook++;
    }

    public void  getAllBook(){
        for (int i = 0; i < countBook; i++) {
            System.out.println(STR."""
                    Product name: \{books[i].getName()}
                    Descraption: \{books[i].getDescription()}
                    Price: \{books[i].getPrice()}
                    Crated at year: \{books[i].getCreatedAt()}
                    Author name: \{books[i].getAuthorName()}
                    """);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                '}' + super.toString();
    }
}
