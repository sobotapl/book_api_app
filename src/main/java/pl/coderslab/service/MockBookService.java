package pl.coderslab.service;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import java.util.List;
import java.util.Optional;
@Component
public class MockBookService implements BookService {

    private List<Book> list;

    private static Long nextId = 4L;

//    public MockBookService() {
//        list = new ArrayList<>();
//        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
//        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
//                "programming"));
//        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
//                "programming"));
//    }

    @Override
    public List<Book> getBooks() {
        return list;
    }

    @Override
    public Optional<Book> getBookById(long id) {
        return list.stream()
                .filter(book -> book.getId() == id)
                .findFirst();
    }

    @Override
    public void addNewBook(Book book) {
        book.setId(nextId++);
        list.add(book);
    }

    @Override
    public void updateBook(Book book) {
        if (getBookById(book.getId()).isPresent()) {
            int bookIndex = list.indexOf(getBookById(book.getId()).get());
            list.set(bookIndex, book);
        }
    }

    @Override
    public void deleteBookById(long id) {
        if (getBookById(id).isPresent()) {
            list.remove(this.getBookById(id).get());
        }
    }

}
