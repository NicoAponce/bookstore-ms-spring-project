package spring.project.msdetailbookstore.controller;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.web.bind.annotation.*;import spring.project.msdetailbookstore.entity.Book;import spring.project.msdetailbookstore.entity.Detail;import spring.project.msdetailbookstore.service.IDetailService;import java.util.List;@RestController@RequestMappingpublic class DetailController {    @Autowired    @Qualifier("serviceFeign")    private IDetailService detailService;    @GetMapping("/select")    public List<Detail> select() {        return detailService.select();    }    @GetMapping("/get/{id}")    public Detail get(@PathVariable Long id) {        return detailService.get(id);    }    @PostMapping("/insert")    public Book insert(@RequestBody Book book) {        return detailService.insert(book);    }    @PutMapping("/update/{id}")    public Book update(@RequestBody Book book, @PathVariable Long id) {        return detailService.update(book, id);    }    @DeleteMapping("/delete/{id}")    public void delete(@PathVariable Long id) {        detailService.delete(id);    }}