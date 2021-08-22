package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Usuario;
import com.dio.pontoeacesso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/create")
    public Usuario createUsuario(@RequestBody Usuario usuario){

        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/todos")
    public List<Usuario> getUsuarioList(){
        return usuarioService.findAll();
    }

    @GetMapping("/id/{IdUsuario}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("IdUsuario") Long IdUsuario) throws Exception {
        return  ResponseEntity.ok(usuarioService.getById(IdUsuario).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario){

        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/delete/{IdUsuario}")
    public void deleteUsuario(@PathVariable("IdUsuario") Long IdUsuario){

        try {
            usuarioService.deleteUsuario(IdUsuario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
