import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "TB_PIZZARIA")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PIZZARIA")
    @SequenceGenerator(
            name = "SQ_PIZZARIA",
            sequenceName = "SQ_PIZZARIA",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_PIZZARIA")
    private Long id;


    @Column(name = "NM_PIZZARIA")
    private String nome;
}