package one.digitainnovationation.desafioAcademia.repository;

import one.digitainnovationation.desafioAcademia.entity.matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class matriculaRepository extends JpaRepository<matricula, Long> {

    /**
     *
     * @param bairro bairro referência para o filtro
     * @return lista de alunos matriculados que residem no bairro passado como parâmetro
     */
    @Query(value = "SELECT * FROM tb_matriculas m " +
            "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
            "WHERE a.bairro = :bairro", nativeQuery = true)
    //@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
    List<matricula> findAlunosMatriculadosBairro(String bairro);

    //List<Matricula> findByAlunoBairro(String bairro);
}
