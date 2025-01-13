import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema de Reserva del Hotel ***");

        // Declarar constantes
        final var VISTA_MAR = 190.50;
        final var SIN_VISTA_MAR = 150.50;

        //creamos consola
        var consola = new Scanner(System.in);

        // Pedimos datos al cliente
        System.out.print("Nombre del cliente: ");
        var cliente = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Quieres un cuarto con vista al mar? (true/false): ");
        var vistas = Boolean.parseBoolean(consola.nextLine());

        // realizamos los calculos
        var costo = 0.0;
        if (vistas)
            costo = diasEstadia * VISTA_MAR;
        else
            costo = diasEstadia * SIN_VISTA_MAR;

        // imprimimos la informacion

        System.out.printf("""
                %n------------- Sus datos de reserva ----------------
                Nombre: %s
                Días de estadía: %d
                Cuarto con vista al mar: %s
                ------------------------            
                Su costo total será de: $%.2f
                """, cliente, diasEstadia, vistas ? "Si :)" : "No :(", costo);
    }
}
