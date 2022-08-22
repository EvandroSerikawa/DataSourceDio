package one.digitainnovationation.desafioAcademia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class avaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name = "peso_atual")
    private double peso;

    @Column(name = "altura_atual")
    private double altura;
}
