import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumarNumeros {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numeroStr;
        String respuesta;
        int numero;
        int acumulador = 0;

        System.out.print("¿Quieres añadir un número? (s/n) ");
        respuesta = br.readLine();

        while(respuesta.equals("s")) {
            System.out.print("Introduzca un número: ");
            numeroStr = br.readLine();
            numero = Integer.parseInt(numeroStr);

            acumulador += numero;

            System.out.print("¿Quieres añadir otro número? (s/n) ");
            respuesta = br.readLine();
        }

        System.out.println("Suma total de todos los números: " + acumulador);
    }
}
