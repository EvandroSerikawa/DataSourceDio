package one.digitainnovationation.desafioAcademia.service.impl;

import one.digitainnovationation.desafioAcademia.entity.aluno;
import one.digitainnovationation.desafioAcademia.entity.form.matriculaForm;
import one.digitainnovationation.desafioAcademia.entity.matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class matriculaServiceImpl {

    @Autowired
    private matriculaRepository matriculaRepository;

    @Autowired
    private alunoRepository alunoRepository;

    @Overridem
    public matricula create(matriculaForm form) {
        matricula matricula = new matricula();
        aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<matricula> getAll(String bairro) {

        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }

    }

    @Override
    public void delete(Long id) {}


}
