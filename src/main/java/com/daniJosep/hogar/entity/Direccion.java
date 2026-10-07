package com.daniJosep.hogar.entity;

public class Direccion {

    private int id;
    private String calle;
    private String numero;
    private String cp;
    private String provincia;

    public int getId() {
        return id;
    }

    public Direccion(){
        this.id = 0;
        this.calle = "calle";
        this.numero = "numero";
        this.cp = "codigo postal";
    }

    public Direccion(int id, String calle, String numero, String cp, String provincia){

        this.id = id;
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
