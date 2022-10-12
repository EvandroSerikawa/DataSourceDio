package one.digitainnovationation.desafioAcademia.repository;

import one.digitainnovationation.desafioAcademia.entity.aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface alunoRepository extends JpaRepository<aluno, Long> {

    /**
     *
     * @param dataDeNascimento: data de nascimento dos alunos
     * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
     */
    List<aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

}
