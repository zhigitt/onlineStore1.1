import java.time.LocalDate;

public class Book extends Product{
    private String authorName;

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

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                '}' + super.toString();
    }
}
