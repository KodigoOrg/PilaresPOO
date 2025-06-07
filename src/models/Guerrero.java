package models;

public class Guerrero extends Personaje{
    private int fuerza;
    private int defensa;

    public Guerrero(String nombre, int salud, int nivel, int energia, int fuerza, int defensa) {
        super(nombre, salud, nivel, energia);
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    public void atacar(Enemigo enemigo){
        if (usarEnergia(10)){
            int danio =  this.fuerza * 2;
            System.out.println(getNombre() + " ataca con su espada a " + enemigo.getNombre() +
                    " causa " + danio + " de danio");
            enemigo.recibirDanio(danio);
        }
    }

    public int defender(){
        if (usarEnergia(5)){
            System.out.println(getNombre() + " se defiende.");
            return defensa *2;
        }
        return defensa;
    }


}
