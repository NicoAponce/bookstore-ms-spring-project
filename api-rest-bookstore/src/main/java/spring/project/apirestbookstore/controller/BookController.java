package spring.project.apirestbookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.project.apirestbookstore.entity.Book;
import spring.project.apirestbookstore.service.IBookService;

import java.util.List;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/select")
    public List<Book> select() {
        return bookService.select("ENABLED");
    }

    @GetMapping("/get/{id}")
    public Book get(@PathVariable Long id) {
        return bookService.get(id);
    }

    @PostMapping("/insert")
    public Book insert(@RequestBody Book book) {
        return bookService.insert(book);
    }

    @PutMapping("/update/{id}")
    public Book update(@RequestBody Book book, @PathVariable Long id) {
        return bookService.update(book, id);
    }

    @DeleteMapping("/delete/{id}")
    public Book delete(@PathVariable Long id) {
        return bookService.delete(id);
    }
}
