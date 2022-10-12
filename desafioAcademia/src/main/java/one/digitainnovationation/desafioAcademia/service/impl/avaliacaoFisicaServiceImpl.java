package one.digitainnovationation.desafioAcademia.service.impl;

import one.digitainnovationation.desafioAcademia.entity.aluno;
import one.digitainnovationation.desafioAcademia.entity.avaliacaoFisica;
import one.digitainnovationation.desafioAcademia.entity.form.avaliacaoFisicaForm;
import one.digitainnovationation.desafioAcademia.entity.form.avaliacaoFisicaUpdateForm;
import one.digitainnovationation.desafioAcademia.service.IavaliacaoFisicaService;
import one.digitainnovationation.desafioAcademia.repository.avaliacaoFisicaRepository;
import one.digitainnovationation.desafioAcademia.repository.alunoRepository;
import one.digitainnovationation.desafioAcademia.repository.matriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class avaliacaoFisicaServiceImpl implements IavaliacaoFisicaService {

    @Autowired
    private avaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private alunoRepository alunoRepository;

    @Override
    public avaliacaoFisica create(avaliacaoFisicaForm form) {
        avaliacaoFisica avaliacaoFisica = new avaliacaoFisica();
        aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public avaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<avaliacaoFisica> getAll() {

        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public avaliacaoFisica update(Long id, avaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }


}


