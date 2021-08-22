package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Movimentacao;
import com.dio.pontoeacesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping("/create")
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){

        return movimentacaoService.saveMovimentacao(movimentacao);
    }

    @GetMapping("/todos")
    public List<Movimentacao> getUMovimentacaoList(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/id/{IdMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoById(@PathVariable("IdMovimentacao") Long IdMovimentacao) throws Exception {
        return  ResponseEntity.ok(movimentacaoService.getById(IdMovimentacao).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){

        return movimentacaoService.updateMovimentacao(movimentacao);
    }

    @DeleteMapping("/delete/{IdMovimentacao}")
    public void deleteMovimentacao(@PathVariable("IdMovimentacao") Long IdMovimentacao){

        try {
            movimentacaoService.deleteMovimentacao(IdMovimentacao);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
