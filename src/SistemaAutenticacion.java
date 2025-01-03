import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE AUTENTICACION DE USUARIOS ***");
        final var USUARIO = "admin";
        final var CONTRASENA = "1234";

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        var contrasenaIngresada = consola.nextLine();

        var resultado = usuarioIngresado.equals(USUARIO) && contrasenaIngresada.equals(CONTRASENA);

        System.out.println("Su estado es = " + resultado);


    }
}
