package com.daniJosep.hogar.controller;

import com.daniJosep.hogar.entity.Direccion;
import com.daniJosep.hogar.exception.AddressNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class DireccionController {

    List<Direccion> direcciones = new ArrayList<>();

    @PostConstruct
    public void direccionesLoader(){
        direcciones.add(new Direccion(1,"Republica Argentina","264","08023","Barcelona"));
    }

    @PostMapping("/direcciones")
    public Direccion createDireccion(@RequestBody Direccion direccion){
        direcciones.add(direccion);
        return direccion;
    }

    @PutMapping("/direcciones/{id}")
    public Direccion updateDireccion(@RequestBody Direccion direccion, @PathVariable int id){
        return direcciones.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .map(p -> {
                    p.setCalle(direccion.getCalle());
                    p.setNumero(direccion.getNumero());
                    p.setCp(direccion.getCp());
                    p.setProvincia(direccion.getProvincia());
                    return p;
                })
                .orElseThrow(() -> new AddressNotFoundException("No se encuentra la dirección con la id: " +id));
        }


    @GetMapping("/direcciones/{id}")
    public Direccion getDireccion(@PathVariable int id){
        return direcciones.stream()
                .filter(direccion -> direccion.getId() ==id)
                .findFirst()
                .orElseThrow(() -> new AddressNotFoundException("No se encontro la dirección"));
    }

    @GetMapping("/direcciones")
    public List<Direccion> getAllDirecciones(){
        return direcciones;
    }

    @DeleteMapping("/direcciones/{id}")
    public void deleteDireccion(@PathVariable int id){
        boolean removed = direcciones.removeIf(p -> p.getId() == id);
        if(!removed)
            throw new AddressNotFoundException("No se ha encontrado el piso a eliminar");
        }
    }


