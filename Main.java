import Restaurant.Restaurante;
import Vegetariano.VegetarianoFactory;
import Gourmet.GourmetFactory;
import Saludable.SaludableFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Menú Vegetariano ---");
        Restaurante Vegetariano = new Restaurante(new VegetarianoFactory());
        Vegetariano.mostrarMenu();

        System.out.println("\n--- Menú Gourmet ---");
        Restaurante Gourmet = new Restaurante(new GourmetFactory());
        Gourmet.mostrarMenu();

        System.out.println("\n--- Menú Saludable ---");
        Restaurante Saludable = new Restaurante(new SaludableFactory());
        Saludable.mostrarMenu();
    }
}