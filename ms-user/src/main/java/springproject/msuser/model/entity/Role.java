package springproject.msuser.model.entity;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;import javax.persistence.*;@Entity@Table(name = "roles")@Data@NoArgsConstructor@AllArgsConstructor@Builderpublic class Role {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;    @Column(unique = true)    private String name;}