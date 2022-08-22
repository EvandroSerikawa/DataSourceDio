package one.digitainnovationation.desafioAcademia.controller;


import one.digitainnovationation.desafioAcademia.entity.form.matriculaForm;
import one.digitainnovationation.desafioAcademia.entity.matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private matriculaerviceImpl service;

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
