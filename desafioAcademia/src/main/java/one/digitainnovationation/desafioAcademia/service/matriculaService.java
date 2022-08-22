package one.digitainnovationation.desafioAcademia.service;

import one.digitainnovationation.desafioAcademia.entity.form.matriculaForm;
import one.digitainnovationation.desafioAcademia.entity.matricula;

import java.util.List;

public interface matriculaService {

    /**
     * Cria uma Matrícula e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    matricula create(matriculaForm form);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    matricula get(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<matricula> getAll(String bairro);

    /**
     * Deleta uma Matrícula específica.
     * @param id - id da Matrícula que será removida.
     */
    void delete(Long id);

}
