package pl.coderslab;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    void addNewBook(Book book);

}
