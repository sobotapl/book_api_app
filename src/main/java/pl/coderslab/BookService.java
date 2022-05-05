package pl.coderslab;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();
    void addNewBook(Book book);
    Optional<Book> getBookById (Long id);
    void updateBook(Book book);
    void deleteBookById(long id);



}
