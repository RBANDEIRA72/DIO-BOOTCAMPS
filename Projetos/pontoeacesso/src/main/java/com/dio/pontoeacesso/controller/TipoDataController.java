package com.dio.pontoeacesso.controller;

import com.dio.pontoeacesso.model.TipoData;
import com.dio.pontoeacesso.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value="/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping("/create")
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }

    @GetMapping("/todos")
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/id/{IdTipoData}")
    public ResponseEntity<TipoData> getTipoDataById(@PathVariable("IdTipoData") Long IdTipoData) throws Exception {
        return  ResponseEntity.ok(tipoDataService.getById(IdTipoData).orElseThrow(() -> new Exception("Not found!")));
    }

    @PutMapping("/update")
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/delete/{IdTipoData}")
    public void deleteTipoData(@PathVariable("IdTipoData") Long IdTipoData){

        try {
            tipoDataService.deleteTipoData(IdTipoData);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
