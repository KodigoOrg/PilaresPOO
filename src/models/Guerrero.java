package models;

public class Guerrero extends Personaje{
    private int fuerza;
    private int defensa;

    public Guerrero(String nombre, int salud, int nivel, int energia, int fuerza, int defensa) {
        super(nombre, salud, nivel, energia);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }




}
