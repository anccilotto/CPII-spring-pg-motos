package br.com.fiap.motos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "TB_VEICULO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_VEICULO_UNIDADE", columnNames = {"UNIDADE", "DT_FIM"}),
})
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VEICULO")
    @SequenceGenerator(name = "SQ_VEICULO"), sequenceName = "SQ_VEICULO", allocationSize = 1)
    @Column(name = "ID_VEICULO")
    private Long id;

    @Column(name = "ST_SUBSTITUTO")
    private Boolean substituto;

    private String nome;

    private Year anoDeFabricacao;

    private String cor;

    private Double preco;

    private Short cilindradas;

    private String modelo;

    //15 digitos
    private String palavraDeEfeito;

    private Fabricante fabricante;

    private TipoVeiculo tipo;

    private Set<Acessorio> acessorios = new LinkedHashSet<>();

}
