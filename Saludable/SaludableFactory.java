package Saludable;
import Factory.MenuFactory;
import Interfaces.*;

public class SaludableFactory implements MenuFactory {
    public Entrada crearEntrada() { return new CremaVegetales(); }
    public PlatoPrincipal crearPlatoPrincipal() { return new PechugaAsada(); }
    public Bebida crearBebida() { return new Agua(); }
    public Postre crearPostre() { return new Yogurt(); }
}