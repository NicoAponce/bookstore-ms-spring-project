package spring.project.msdetailbookstore.implementation;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import spring.project.msdetailbookstore.client.IBookClient;import spring.project.msdetailbookstore.entity.Book;import spring.project.msdetailbookstore.entity.Detail;import spring.project.msdetailbookstore.service.IDetailService;import java.util.ArrayList;import java.util.List;@Service("serviceFeign")public class DetailServiceImpl implements IDetailService {    @Autowired    private IBookClient bookClient;    @Override    public List<Detail> select() {        List<Detail> details = new ArrayList<>();        for (Book book : bookClient.select()) {            Detail detail = new Detail(book);            details.add(detail);        }        return details;    }    @Override    public Detail get(Long id) {        return new Detail(bookClient.get(id));    }    @Override    public Book insert(Book book) {        return bookClient.insert(book);    }    @Override    public Book update(Book book, Long id) {        return bookClient.update(book, id);    }    @Override    public void delete(Long id) {        bookClient.delete(id);    }}