package models;

public class Personaje {
    private String nombre;
    private int salud;
    private int nivel;
    private int energia;

    /**
     * Constructor con sobrecarga
     * @param nombre
     */
    public Personaje(String nombre) {
        this(nombre, 100, 10, 75);
    }


    /**
     * Contructor normal
     * @param nombre
     * @param salud
     * @param nivel
     * @param energia
     */
    public Personaje(String nombre, int salud, int nivel, int energia) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        this.energia = energia;
    }

    /**
     * Metodo para recibir danio de personaje
     * @param danio
     */
    public void recibirDanio(int danio){
        if (danio>0){
            this.salud = Math.max(0, this.salud-danio);
            System.out.println(
                    this.nombre + " recibio "+ danio
                    + " de danio. Salud actual: "+ this.salud
            );
        }
    }


    public boolean usarEnergia(int cantidad){
        if (cantidad>0 && cantidad <= this.energia){
            this.energia -= cantidad;
            return true;
        }else {
            System.out.println(this.nombre + " no tinee suficiente energia.");
            return false;
        }
    }

    public void descansar(){
        this.energia = Math.min(100, this.energia+25);
        System.out.println(this.nombre + " descanso. Energia actual: " + this.energia);
    }
}
