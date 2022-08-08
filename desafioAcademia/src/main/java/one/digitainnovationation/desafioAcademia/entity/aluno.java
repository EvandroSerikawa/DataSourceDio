package one.digitainnovationation.desafioAcademia.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Column(unique = true)
    private String CPF;
    private String bairro;
    private LocalDate dataDeNascimento;
    @OneToMany(mappedBy = "aluno" , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<avaliacaoFisica> avaliacoes = new ArrayList<>();


}
