import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        // Creando consola
        var consola = new Scanner(System.in);
        var salir = false;

        // Menú interactivo
        while (!false){
            System.out.print("""
                     *** Bienvenido a la calculadora en Java ***"
                     \nOperaciones que puedes realizar:
                     1. Sumar
                     2. Restar
                     3. Multiplicar
                     4. Dividir
                     5. Salir
                     Escoge una opcion:\s""");
            var opcion = consola.nextInt(); // al ser un numero el ingresado

            // Validaciones y operaciones
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingrese el primer valor: ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    var valor2 = consola.nextDouble();
                    // operacion final
                    var resultadoSuma = valor1 += valor2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n",resultadoSuma);
                }
                case 2 ->{
                    System.out.print("Ingrese el primer valor: ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    var valor2 = consola.nextDouble();
                    // operacion final
                    var resultadoResta = valor1 -= valor2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n",resultadoResta);
                }
                case 3 -> {
                    System.out.print("Ingrese el primer valor: ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    var valor2 = consola.nextDouble();
                    // operacion final
                    var resultadoMulti = valor1 * valor2;
                    System.out.printf("El resultado de la multiplicación es: %.2f%n%n",resultadoMulti);
                }
                case 4 -> {
                    System.out.print("Ingrese el primer valor: ");
                    var valor1 = consola.nextDouble();
                    System.out.print("Ingrese el segundo valor: ");
                    var valor2 = consola.nextDouble();
                    // operacion final
                    if (valor2 != 0) {
                        var resultadoDivi = valor1 / valor2;
                        System.out.printf("El resultado de la division es: %.2f%n%n", resultadoDivi);
                    } else {
                        System.out.println("Error: division por cero, no valida");
                    }
                }
                case 5 -> {
                    System.out.println("¡Saliendo de la calculadora, hasta pronto!\n");
                    salir = true;
                }
                default -> System.out.println("Opción invalida. " + "Selecciona otra opción. \n");
            }
        }
    }
}
