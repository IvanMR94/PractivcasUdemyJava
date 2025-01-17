import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** App de suma en diagonal de una matriz ***");
        int columnas, filas;
        var consola = new Scanner(System.in);

        //solicitar datos de matriz
        System.out.print("Ingrese columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese filas: ");
        filas = Integer.parseInt(consola.nextLine());

        //iniciar matriz
        var matriz = new int[columnas][filas];

        //Solicitar valores en la matriz
        for (int col =0; col < columnas; col++){
            for (int fil =0; fil < filas; fil++){
                System.out.print("Ingrese valor [" + col + "][" + fil + "] : ");
                matriz[col][fil] = Integer.parseInt(consola.nextLine());
            }
        }

        //realizar calculos
        int suma = 0;
        for (int col =0; col < columnas; col++){
            for (int fil =0; fil < filas; fil++){
                if(col == fil){
                    suma += matriz[col][fil]; // se suma el elemento de la columna y la fila
                }
            }
        }
        System.out.println("\nEl resultado de la suma en diagonal de la matriz es de: " + suma);
    }
}
