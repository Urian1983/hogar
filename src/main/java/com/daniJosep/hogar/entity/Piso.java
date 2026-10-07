/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniJosep.hogar.entity;

/**
 *
 * @author UsuarioM
 */
public class Piso {
    private String numeroPiso;
    private String puerta;
    private String superficie;
    private String codigoCatastral;
    private String Estado;
    private int id;

    public Piso(int id, String numeroPiso, String puerta, String superficie, String codigoCatastral, String Estado) {
        this.numeroPiso = numeroPiso;
        this.id = id;
        this.puerta = puerta;
        this.superficie = superficie;
        this.codigoCatastral = codigoCatastral;
        this.Estado = Estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

    public String getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(String numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getCodigoCatastral() {
        return codigoCatastral;
    }

    public void setCodigoCatastral(String codigoCatastral) {
        this.codigoCatastral = codigoCatastral;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
}
