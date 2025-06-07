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
    public void recibirDanio(int danio) {
        if (danio>0){
            setSalud(Math.max(0, this.getSalud()-danio));
            System.out.println(
                    getNombre() + " recibio "+ danio
                            + " de danio. Salud actual: "+ getSalud()
            );
        }
    }


    @Override
    public boolean estaVivo() {
        return false;
    }
}
