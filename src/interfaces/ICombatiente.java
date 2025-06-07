package interfaces;

import models.Personaje;

public interface ICombatiente {
    void atacar(Personaje objetivo);
    void recibirDanio(int danio);
    boolean estaVivo();

}
