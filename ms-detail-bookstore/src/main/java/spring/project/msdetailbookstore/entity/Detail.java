package spring.project.msdetailbookstore.entity;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;@Data@NoArgsConstructor@AllArgsConstructor@Builderpublic class Detail {    private Book book;    public Double getTotal() {        return book.getQuantity() * book.getPrice().doubleValue();    }}