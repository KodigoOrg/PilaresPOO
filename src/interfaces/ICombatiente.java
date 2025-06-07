package interfaces;

public interface ICombatiente {
    void atacar(Personaje objetivo);
    void recibirDanio(int danio);
    boolean estaVivo();

}
