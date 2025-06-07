import models.items.Arma;
import models.items.Item;
import models.personajes.Arquero;
import models.personajes.Enemigo;
import models.personajes.Guerrero;
import models.personajes.Personaje;
import services.CombateUtils;

import static services.CombateUtils.iniciarCombate;

public class DemoJuego {

    public static void main(String[] args) {
        System.out.println("INICIO DE DEMOSTRACION DE COMBATES");

        Personaje guerrero = new Guerrero("Aragon", 200, 10, 200, 10, 20);
        Personaje arquero = new Arquero("Legolas", 150, 12, 180, 30, 100);

        Personaje enemigo = new Enemigo("Orgo de las nieves");
        Personaje enemigo2 = new Enemigo("Loba salvaje");

        Item arco = new Arma("Arco", "lanza flechas muy rapido", 20, 30);
        Item espada = new Arma("Espada", "corta cuerpos", 30, 50);

        System.out.println("Inicio de combate========================================");

        iniciarCombate(guerrero, enemigo2);
        iniciarCombate(arquero, enemigo);

    }
}
