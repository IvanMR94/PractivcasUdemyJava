import java.util.Scanner;

public class PromedioCalificaiones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de calificaciones ***");

        //iniciar consola
        var consola = new Scanner(System.in);

        //agregar cantidad de calificaciones
        System.out.print("Cuantas calificaciones quieres agregar?: ");
        var cantCalificaciones = Integer.parseInt(consola.nextLine());

        //Asignar en el arreglo
        var calificaciones = new int[cantCalificaciones];

        for(var i = 0; i < cantCalificaciones; i++){
            System.out.print("Asigne calificaion al indice [" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        double suma = 0;

        //calcular el promedio
        for (int calificacion : calificaciones) {
           suma += calificacion;
        }
        var promedio = suma / calificaciones.length;

        System.out.println("\nEl promedio de las calificaiones se de: "+ promedio);
    }
}
