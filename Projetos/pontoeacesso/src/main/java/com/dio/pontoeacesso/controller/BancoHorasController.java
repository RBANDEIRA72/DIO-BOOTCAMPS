package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.BancoHoras;
import com.dio.pontoeacesso.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/bancohoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping("/create")
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){

        return bancoHorasService.saveBancoHoras(bancoHoras);
    }

    @GetMapping("/todos")
    public List<BancoHoras> getBancoHorasList(){
        return bancoHorasService.findAll();
    }

    @GetMapping("/id/{IdBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasById(@PathVariable("IdBancoHoras") Long IdBancoHoras) throws Exception {
        return  ResponseEntity.ok(bancoHorasService.getById(IdBancoHoras).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){

        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping("/delete/{IdBancoHoras}")
    public void deleteBancoHoras(@PathVariable("IdBancoHoras") Long IdBancoHoras){

        try {
            bancoHorasService.deleteBancoHoras(IdBancoHoras);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
