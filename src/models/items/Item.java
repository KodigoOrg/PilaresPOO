package models.items;

import models.personajes.Personaje;

public class Item {
    private String nombre;
    private String descripcion;
    private double peso;

    public Item(String nombre, String descripcion, double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public void usar(Personaje personaje){
        System.out.println(personaje.getNombre() + " esta utilizando "+ this.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
