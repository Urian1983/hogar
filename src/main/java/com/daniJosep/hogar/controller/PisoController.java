package com.daniJosep.hogar.controller;

import com.daniJosep.hogar.entity.Piso;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class PisoController {

    List<Piso> pisos = new ArrayList<>();

    @PostConstruct
    public void pisosLoader(){
        pisos.add(new Piso("Republica Argentina","264","08023","Barcelona"));
    }

    @PostMapping("/pisos")
    public Piso createPiso(@RequestBody Piso piso){
        pisos.add(piso);
        return piso;
    }

    @PutMapping("/pisos")
    public Piso updatePiso(@RequestBody Piso piso, @PathVariable int id){

        for(Piso p : pisos){
            if(p.getId() == id){
                p.setProvincia(piso.getProvincia());
                p.setCalle(piso.getCalle());
                p.setNumero(piso.getNumero());
                p.setCp(piso.getCp());
                p.setProvincia(piso.getProvincia());
                return p;
            }
        }
        return null;
    }

    @GetMapping("/pisos")
    public Piso getPiso(@PathVariable int id){
        for(Piso piso : pisos){
            if(piso.getId() == id){
                return piso;
            }
        }
        return null;
    }

    @GetMapping
    public List<Piso> getPisos(){
        return pisos;
    }

    @DeleteMapping
    public void deletePiso(@RequestParam int id){
        pisos.removeIf(piso -> piso.getId() == id);
        }
    }


