package models.items;

import models.personajes.Personaje;

public class Arma extends Item{
    private int danio;

    public Arma(String nombre, String descripcion, double peso, int danio) {
        super(nombre, descripcion, peso);
        this.danio = danio;
    }


    @Override
    public void usar(Personaje personaje) {
        super.usar(personaje);
    }
}
