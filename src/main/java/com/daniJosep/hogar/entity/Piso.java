package com.daniJosep.hogar.entity;

public class Piso {

    int id;
    String calle;
    String numero;
    String cp;
    String provincia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Piso(){

    }

    public Piso(String calle, String numero, String cp, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
