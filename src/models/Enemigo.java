package models;

import interfaces.ICombatiente;

public class Enemigo extends Personaje implements ICombatiente {
    private int poder;

    public Enemigo(String nombre) {
        super(nombre);
    }


    @Override
    public void atacar(Personaje objetivo) {
        int danio  = this.poder;
        System.out.println(this.getNombre() + " ataca a " +  objetivo.getNombre() +
                " por " + danio + " de danio"
        );
        objetivo.recibirDanio(danio);

    }

    @Override
    public boolean estaVivo() {
        return false;
    }
}
