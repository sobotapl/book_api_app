package pl.coderslab.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/books")
public class ManageBookController {

    private final BookService bookService;


    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = bookService.getBooks();
        model.addAttribute("books", books);
        return "books-all";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("book", new Book());
        return "book-add";
    }

    @PostMapping("/add")
    public String saveBook(@Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "books/add";
        }
        bookService.addNewBook(book);
        return "redirect:/admin/books/all";
    }


}

