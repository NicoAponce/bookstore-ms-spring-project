package spring.project.apirestbookstore.model.entity;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;import javax.persistence.*;import java.util.Date;@Entity@Table(name = "books")@Data@NoArgsConstructor@AllArgsConstructor@Builderpublic class Book {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;    private String title;    private String description;    @ManyToOne(fetch = FetchType.LAZY)    @JoinColumn(name = "author_id")    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})    private Author author;    @ManyToOne(fetch = FetchType.LAZY)    @JoinColumn(name = "category_id")    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})    private Category category;    private String language;    private Integer pages;    private Integer quantity;    private Double price;    @Column(name = "created_at")    @Temporal(TemporalType.DATE)    private Date createdAt;    private String status;}