package pac.repositories;

import pac.models.Book;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSimulator {

    public List<Book> getAllBooks(){

        List<Book> bookList = new ArrayList<>();
        Book b1 = new Book("Tapeter och solsken", "Janne Andersson", 1);
        Book b2 = new Book("Böcker jag läst", "Svante Karlsson", 2);
        Book b3 = new Book("Java och annat", "Ida Malmkvist", 3);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        return bookList;
    }
}
