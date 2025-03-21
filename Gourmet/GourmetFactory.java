package Gourmet;
import Factory.MenuFactory;

import Interfaces.*;
public class GourmetFactory implements MenuFactory {
    public Entrada crearEntrada() { return new SopaGourmet(); }
    public PlatoPrincipal crearPlatoPrincipal() { return new Filete(); }
    public Bebida crearBebida() { return new Vino(); }
    public Postre crearPostre() { return new Tiramisu(); }
}