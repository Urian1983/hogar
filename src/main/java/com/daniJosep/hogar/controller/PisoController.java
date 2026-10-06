package com.daniJosep.hogar.controller;

import com.daniJosep.hogar.entity.Piso;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
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


}
