package one.digitainnovationation.desafioAcademia.service.impl;

import one.digitainnovationation.desafioAcademia.entity.aluno;
import one.digitainnovationation.desafioAcademia.entity.avaliacaoFisica;
import one.digitainnovationation.desafioAcademia.entity.form.alunoForm;
import one.digitainnovationation.desafioAcademia.entity.form.alunoUpdateForm;
import one.digitainnovationation.desafioAcademia.infra.utils.JavaTimeUtils;
import one.digitainnovationation.desafioAcademia.repository.alunoRepository;
import one.digitainnovationation.desafioAcademia.service.alunoService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class alunoServiceImpl implements alunoService {

    @Autowired
    private alunoRepository repository;

    @Override
    public aluno create(alunoForm form) {
        aluno aluno = new aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public aluno get(Long id) {
        return null;
    }

    @Override
    public List<aluno> getAll(String dataDeNascimento) {

        if(dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }

    }

    @Override
    public aluno update(Long id, alunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public List<avaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();

    }


}
