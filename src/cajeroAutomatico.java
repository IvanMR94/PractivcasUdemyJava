import java.util.Scanner;

public class cajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;

        // Menu de la app
        // mientras NO querramos salir deel menu...
        while (!salir){
            System.out.print("""
                    *** Aplicacion de Cajero Automático ***
                    Operaciones que pueder realizar:
                    1 - Consultar saldo.
                    2 - Retirar.
                    3 - Depositar.
                    4 - Salir.
                    Escoge una opcion:\s""");

            var opcion = consola.nextInt(); // al ser un numero el ingresado
            // procesamos cada opcion
            switch (opcion){
                case 1 -> System.out.printf("Tu saldo actual es: %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = consola.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro; // saldo = saldo - retiro, se usa operador compuesto
                        System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
                    }
                    else
                        System.out.printf("No cuentas con el saldo suficiente. "
                                + "Tu saldo actual es: %.2f%n%n", saldo);
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito; //saldo = salgo + deposito.
                    System.out.printf("Tu nuevo saldo es: %.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. ¡Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción invalida. " + "Selecciona otra opción. \n");
            }
        }
    }
}
