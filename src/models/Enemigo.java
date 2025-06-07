package models;

import interfaces.ICombatiente;

public class Enemigo extends Personaje implements ICombatiente {
    private int poder;

    public Enemigo(String nombre) {
        super(nombre);
    }


    @Override
    public void atacar(Personaje objetivo) {

    }

    @Override
    public boolean estaVivo() {
        return false;
    }
}
