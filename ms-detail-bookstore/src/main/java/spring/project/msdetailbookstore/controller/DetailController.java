package spring.project.msdetailbookstore.controller;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Qualifier;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import spring.project.msdetailbookstore.entity.Detail;import spring.project.msdetailbookstore.service.IDetailService;import java.util.List;@RestController@RequestMappingpublic class DetailController {    @Autowired    @Qualifier("serviceFeign")    private IDetailService detailService;    @GetMapping("/select")    public List<Detail> select() {        return detailService.select();    }    @GetMapping("/get/{id}")    public Detail get(@PathVariable Long id) {        return detailService.get(id);    }}