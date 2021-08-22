package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.CategoriaUsuario;
import com.dio.pontoeacesso.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/categoriausuario")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping("/create")
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping("/todos")
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/id/{IdCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUsuarioById(@PathVariable("IdCategoriaUsuario") Long IdCategoriaUsuario) throws Exception {
        return  ResponseEntity.ok(categoriaUsuarioService.getById(IdCategoriaUsuario).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping("/delete/{IdCategoriaUsuario}")
    public void deleteCategoriaUsuario(@PathVariable("IdCategoriaUsuario") Long IdCategoriaUsuario){

        try {
            categoriaUsuarioService.deleteCategoriaUsuario(IdCategoriaUsuario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
