package pac.models;

public class Book {
    private String title;
    private String Author;
    private int id;

    public Book() {
    }

    public Book(String title, String author, int id) {
        this.title = title;
        Author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
