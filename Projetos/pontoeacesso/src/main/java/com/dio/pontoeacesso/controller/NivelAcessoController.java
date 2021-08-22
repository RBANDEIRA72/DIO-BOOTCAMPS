package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.NivelAcesso;
import com.dio.pontoeacesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping("/create")
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }

    @GetMapping("/todos")
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/id/{IdNivelAcesso}")
    public ResponseEntity<NivelAcesso> getJornadaById(@PathVariable("IdNivelAcesso") Long IdNivelAcesso) throws Exception {
        return  ResponseEntity.ok(nivelAcessoService.getById(IdNivelAcesso).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }

    @DeleteMapping("/delete/{IdNivelAcesso}")
    public void deleteNivelAcesso(@PathVariable("IdNivelAcesso") Long IdNivelAcesso){

        try {
            nivelAcessoService.deleteNivelAcesso(IdNivelAcesso);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
