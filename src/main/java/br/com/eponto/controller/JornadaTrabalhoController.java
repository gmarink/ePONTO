package br.com.eponto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.eponto.model.JornadaTrabalho;
import br.com.eponto.service.JornadaService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();

    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho>  getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
       try {
           jornadaService.deleteJornada(idJornada);
       }catch (Exception e){
           System.out.println(e.getMessage());
            
       }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }



}
