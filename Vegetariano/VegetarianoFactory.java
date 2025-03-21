package Vegetariano;

import Factory.MenuFactory;
import Interfaces.*;
public class VegetarianoFactory implements MenuFactory {
    public Entrada crearEntrada() { return new Ensalada(); }
    public PlatoPrincipal crearPlatoPrincipal() { return new LasañaVegetariana(); }
    public Bebida crearBebida() { return new JugoNatural(); }
    public Postre crearPostre() { return new Fruta(); }
}
