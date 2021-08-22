package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Localidade;
import com.dio.pontoeacesso.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/localidade")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;

    @PostMapping("/create")
    public Localidade createLocalidade(@RequestBody Localidade localidade){

        return localidadeService.saveLocalidade(localidade);
    }

    @GetMapping("/todos")
    public List<Localidade> getLocalidadeList(){
        return localidadeService.findAll();
    }

    @GetMapping("/id/{IdLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("IdLocalidade") Long IdLocalidade) throws Exception {
        return  ResponseEntity.ok(localidadeService.getById(IdLocalidade).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Localidade updateLocalidade(@RequestBody Localidade localidade){

        return localidadeService.updateLocalidade(localidade);
    }

    @DeleteMapping("/delete/{IdLocalidade}")
    public void deleteLocalidade(@PathVariable("IdLocalidade") Long IdLocalidade){

        try {
            localidadeService.deleteLocalidade(IdLocalidade);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
