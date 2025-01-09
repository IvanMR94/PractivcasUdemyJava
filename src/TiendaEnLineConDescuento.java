import java.util.Scanner;

public class TiendaEnLineConDescuento {
    public static void main(String[] args) {
        System.out.println("*** Tienda en linea con Descuentos ***");

        // condiciones

        final var MONTO_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);
        System.out.print("Cual fue el monto de tu compra? : ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda? (true/false): ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        //calculamos el descuento

        var descuento = 0.0;

        //verificamos cada caso, con los datos aportados

        if (montoCompra >= MONTO_COMPRA_DESC && eresMiembro){
            descuento = 0.1; // descuento del 10%
        }
        else if (eresMiembro){
            descuento = 0.5; //descuento del 5%
        }
        else { //no supero el monto minimo d ela compra y tampoco es miembro
            descuento =0; // descuento del 0%
        }

        //hacemos los calculos respectivos

        if(descuento != 0){
            var montoDescuento = montoCompra * descuento;
            var montofinal = montoCompra - montoDescuento;
            //cadena multilinea
            System.out.printf("""
                    %nFelicidades!!!, has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f%n
                    """,descuento * 100,montoCompra, montoDescuento, montofinal);
        }
        else {
            System.out.printf("""
                    %nNo obtuviste ningun tipo de descuento!.
                    Te invitamos a hacerte miembro de la tienda!.
                    Monto final de la compra: $%.2f%n
                    """,montoCompra);
        }
    }
}
