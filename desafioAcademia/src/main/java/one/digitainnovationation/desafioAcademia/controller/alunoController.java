package one.digitainnovationation.desafioAcademia.controller;


import one.digitainnovationation.desafioAcademia.entity.aluno;
import one.digitainnovationation.desafioAcademia.entity.avaliacaoFisica;
import one.digitainnovationation.desafioAcademia.entity.form.alunoForm;
import one.digitainnovationation.desafioAcademia.service.impl.alunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class alunoController {

    @Autowired
    private alunoServiceImpl service;


    @PostMapping
    public aluno create(@Valid @RequestBody alunoForm form){

        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<avaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                              String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }

}
