package spring.project.apirestbookstore.service;import spring.project.apirestbookstore.entity.Book;import java.util.List;public interface IBookService {    List<Book> select(String status);    Book get(Long id);    Book insert(Book book);    Book update(Book book, Long id);    Book delete(Long id);}