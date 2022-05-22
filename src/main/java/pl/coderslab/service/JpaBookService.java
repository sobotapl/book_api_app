package pl.coderslab.service;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;
import pl.coderslab.repository.BookRepository;
import pl.coderslab.service.BookService;

import java.util.List;
import java.util.Optional;

@Data
@Service
@Primary
public class JpaBookService implements BookService {

    private final BookRepository bookRepository;


    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void addNewBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public Optional<Book> getBookById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);

    }

    @Override
    public void deleteBookById(long id) {
        bookRepository.deleteById(id);

    }


}
