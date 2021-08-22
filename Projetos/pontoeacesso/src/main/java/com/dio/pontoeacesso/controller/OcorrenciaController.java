package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Ocorrencia;
import com.dio.pontoeacesso.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping("/create")
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping("/todos")
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/id/{IdOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable("IdOcorrencia") Long IdOcorrencia) throws Exception {
        return  ResponseEntity.ok(ocorrenciaService.getById(IdOcorrencia).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/delete/{IdOcorrencia}")
    public void deleteOcorrencia(@PathVariable("IdOcorrencia") Long IdOcorrencia){

        try {
            ocorrenciaService.deleteOcorrencia(IdOcorrencia);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
