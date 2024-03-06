import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    Id long;
    String nome;
    String cor;
    Double preco;
    Short cilindradas;
}

