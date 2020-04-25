package pac.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pac.models.Book;
import pac.repositories.DatabaseSimulator;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    DatabaseSimulator bookDaoDB;
    List<Book> bookList;

    public BookController() {
        bookDaoDB = new DatabaseSimulator();
         bookList = bookDaoDB.getAllBooks();
    }

    @RequestMapping(value = "/bookJSON", produces = "application/json")
    public Book oneBookJSON() {
        return new Book("Tapeter och solsken", "Janne Andersson", 10);
    }

    @RequestMapping(value = "/bookXML", produces = "application/xml")
    public Book oneBookXML() {
        return new Book("Tapeter och solsken", "Janne Andersson", 10);
    }

    @RequestMapping(value = "/books", produces = "application/json")
    public List<Book> index() {
        return bookList;
    }

    @RequestMapping(value = "/book/{id}", produces = "application/json")
    public Book getBookById(@PathVariable int id){
        Book res =null;
        for (Book b : bookList){
            if (b.getId() == id){
                res = b;
            }
        }
        return res;
    }

    @RequestMapping(value = "/booksBetween/{idFrom}/{idTo}", produces = "application/json")
    public List<Book> getBooksBetween(@PathVariable int idFrom, @PathVariable int idTo){
        List<Book> res = new ArrayList();
        for (Book b : bookList){
            int id = b.getId();
            if (id >= idFrom && id <= idTo){
                res.add(b);
            }
        }
        return res;
    }



}
