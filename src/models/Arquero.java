package models;

public class Arquero extends Personaje{
    private int destreza;
    private int flechas;

    public Arquero(String nombre, int salud, int nivel, int energia, int destreza, int flechas) {
        super(nombre, salud, nivel, energia);
        this.destreza = destreza;
        this.flechas = flechas;
    }

    public void setFlechas(int flechas) {
        if(flechas>0) this.flechas = flechas;
    }

    public void atacar(Personaje objetivo){
        if (flechas > 0 && usarEnergia(8)){
            flechas--;
            double danio = destreza * 2.5;
            System.out.println(this.getNombre()+ " dispara una flecha a " +
                    objetivo.getNombre() + " causando " + danio + " de danio"

            );

            objetivo.recibirDanio( (int) danio );
        }
    }
}
