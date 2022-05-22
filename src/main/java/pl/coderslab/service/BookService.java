package pl.coderslab.service;
import pl.coderslab.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();

    Optional<Book> getBookById(long id);

    void addNewBook(Book book);

    void updateBook(Book book);

    void deleteBookById(long id);



}
