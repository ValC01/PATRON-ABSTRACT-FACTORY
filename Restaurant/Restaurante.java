package Restaurant;
import Factory.MenuFactory;
import Interfaces.*;

public class Restaurante {
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    private Postre postre;

    public Restaurante(MenuFactory factory) {
        this.entrada = factory.crearEntrada();
        this.platoPrincipal = factory.crearPlatoPrincipal();
        this.bebida = factory.crearBebida();
        this.postre = factory.crearPostre();
    }

    public void mostrarMenu() {
        entrada.mostrar();
        platoPrincipal.mostrar();
        bebida.mostrar();
        postre.mostrar();
    }
}
