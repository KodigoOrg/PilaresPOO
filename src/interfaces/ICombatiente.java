package interfaces;

import models.personajes.Personaje;

public interface ICombatiente {
    void atacar(Personaje objetivo);
    void recibirDanio(int danio);
    boolean estaVivo();

}
