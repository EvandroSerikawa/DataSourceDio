package one.digitainnovationation.desafioAcademia.controller;


import one.digitainnovationation.desafioAcademia.entity.avaliacaoFisica;
import one.digitainnovationation.desafioAcademia.entity.form.avaliacaoFisicaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class avaliacaoFisicaController {

    @Autowired
    private avaliacaoFisicaServiceImpl service;

    @PostMapping
    public avaliacaoFisica create(@RequestBody avaliacaoFisicaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<avaliacaoFisica> getAll(){
        return service.getAll();
    }



}
