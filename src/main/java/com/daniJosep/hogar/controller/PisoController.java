package com.daniJosep.hogar.controller;

import com.daniJosep.hogar.entity.Piso;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UsuarioM
 */
@RestController
@RequestMapping("api")
public class PisoController {
    ArrayList<Piso> pisos = new ArrayList<>();


@PostConstruct
public void cargarDatos(){
    pisos.add(new Piso(1,"4","A","200","3454656","usado"));
}

@GetMapping("/pisos")
public List<Piso> getPisos(){
    return pisos;
}

@GetMapping("/pisos/{id}")
public Piso getPiso(@PathVariable int id){
    for(int i = 0; i < pisos.size();i++){
        if(pisos.get(i).getId()==id){
            return pisos.get(i);
        }
    }
    return null;
}

@DeleteMapping("/pisos/{id}")
public void deletePiso(@PathVariable int id){
    for(int i = 0; i < pisos.size();i++){
        if(pisos.get(i).getId()==id){
            pisos.remove(i);
        }
    }
}
}