package one.digitainnovationation.desafioAcademia.controller;


import one.digitainnovationation.desafioAcademia.entity.form.matriculaForm;
import one.digitainnovationation.desafioAcademia.entity.matricula;
import one.digitainnovationation.desafioAcademia.service.impl.matriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private matriculaServiceImpl service;

    @PostMapping
    public matricula create(@Valid @RequestBody matriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<matricula> getAll(@RequestParam(value = "bairro" , required = false)
                                  String bairro){
        return service.getAll(bairro);
    }

}
