package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Empresa;
import com.dio.pontoeacesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/empresa")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping("/create")
    public Empresa createEmpresa(@RequestBody Empresa empresa){

        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping("/todos")
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/id/{IdEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("IdEmpresa") Long IdEmpresa) throws Exception {
        return  ResponseEntity.ok(empresaService.getById(IdEmpresa).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){

        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/delete/{IdEmpresa}")
    public void deleteEmpresa(@PathVariable("IdEmpresa") Long IdEmpresa){

        try {
            empresaService.deleteEmpresa(IdEmpresa);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
