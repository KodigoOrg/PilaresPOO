package services;

import models.personajes.Arquero;
import models.personajes.Enemigo;
import models.personajes.Guerrero;
import models.personajes.Personaje;

public class CombateUtils {
    public static void iniciarCombate(Personaje atacante, Personaje defensor) {
        System.out.println("Combate entre : " + atacante.getNombre() +" y " + defensor.getNombre());

        if( atacante instanceof Guerrero ){
            ((Guerrero)atacante).atacar((Enemigo)defensor);
        }else if (atacante instanceof Arquero){
            ((Arquero)atacante).atacar((Enemigo)defensor);
        }

    }
}
