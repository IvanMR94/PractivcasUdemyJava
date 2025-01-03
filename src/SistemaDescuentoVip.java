import java.util.Scanner;

public class SistemaDescuentoVip {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Descuentos VIP ***");
        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);
        System.out.print("Cuantos productos compraste hoy? : ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());
        System.out.print("Tienes la membresia de la tienda? (true/fale): ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMembresia;
        System.out.println("Tienes acceso al descuento VIP? = " + esElegibleDescuento);
    }
}
