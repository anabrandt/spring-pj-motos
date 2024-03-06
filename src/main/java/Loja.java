package br.com.benefrancis.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TB_PRODUTO")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @SequenceGenerator(
            name = "SQ_PRODUTO",
            sequenceName = "SQ_PRODUTO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NM_PRODUTO")
    private String nome;

    private BigDecimal preco;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "TIPO_ID",
            referencedColumnName = "ID_TIPO_VEICULO"
            , foreignKey = @ForeignKey(name = "FK_TIPO_VEICULO")
    )
    private Loja loja;


    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_OPCIONAL_PRODUTO",
            joinColumns = {
                    @JoinColumn(name = "PRODUTO", referencedColumnName = "ID_PRODUTO", foreignKey = @ForeignKey(name = "FK_PRODUTO_OPCIONAL"))
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "OPCIONAL", referencedColumnName = "ID_OPCIONAL", foreignKey = @ForeignKey(name = "FK_OPCIONAL_PRODUTO"))
            }
    )
    private Set<Opcional> opcionais = new LinkedHashSet<>();


}