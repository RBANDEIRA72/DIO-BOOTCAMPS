package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.Calendario;
import com.dio.pontoeacesso.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/calendario")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;

    @PostMapping("/create")
    public Calendario createCalendario(@RequestBody Calendario calendario){

        return calendarioService.saveCalendario(calendario);
    }

    @GetMapping("/todos")
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }

    @GetMapping("/id/{IdCalendario}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable("IdCalendario") Long IdCalendario) throws Exception {
        return  ResponseEntity.ok(calendarioService.getById(IdCalendario).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public Calendario updateCalendario(@RequestBody Calendario calendario){

        return calendarioService.updateCalendario(calendario);
    }

    @DeleteMapping("/delete/{IdCalendario}")
    public void deleteCalendario(@PathVariable("IdCalendario") Long IdCalendario){

        try {
            calendarioService.deleteCalendario(IdCalendario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
