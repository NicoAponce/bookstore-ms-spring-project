package spring.project.apirestbookstore.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.project.apirestbookstore.model.dto.BookDto;
import spring.project.apirestbookstore.model.entity.Book;
import spring.project.apirestbookstore.service.IBookService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private IBookService bookService;


    @Autowired
    private ModelMapper modelMapper;

    private BookDto convertToDto(Book book) {
        return modelMapper.map(book, BookDto.class);
    }

    private Book convertToEntity(BookDto bookDto) {
        return modelMapper.map(bookDto, Book.class);
    }

    @GetMapping("/select")
    public List<BookDto> select() {
        List<Book> books = bookService.select("ENABLED");
        return books.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/get/{id}")
    public BookDto get(@PathVariable Long id) {
        return convertToDto(bookService.get(id));
    }

    @PostMapping("/insert")
    public BookDto insert(@RequestBody BookDto bookDto) {
        Book db = convertToEntity(bookDto);
        Book create = bookService.insert(db);
        return convertToDto(create);

    }

    @PutMapping("/update/{id}")
    public BookDto update(@RequestBody BookDto bookDto, @PathVariable Long id) {
        Book db = convertToEntity(bookDto);
        Book edit = bookService.update(db, id);
        return convertToDto(edit);
    }

    @DeleteMapping("/delete/{id}")
    public Book delete(@PathVariable Long id) {
        return bookService.delete(id);
    }
}
