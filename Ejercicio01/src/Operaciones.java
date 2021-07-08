import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operaciones {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el primer número entero: ");
        String enteroStr1 = br.readLine();
        System.out.print("Ingrese el segundo número entero: ");
        String enteroStr2 = br.readLine();

        System.out.print("Ingrese el primer número decimal: ");
        String decimalStr1 = br.readLine();
        System.out.print("Ingrese el segundo número decimal: ");
        String decimalStr2 = br.readLine();

        int entero1 = Integer.parseInt(enteroStr1);
        int entero2 = Integer.parseInt(enteroStr2);

        float decimal1 = Float.parseFloat(decimalStr1);
        float decimal2 = Float.parseFloat(decimalStr2);

        System.out.println("Enteros");
        System.out.println(entero1 + " + " + entero2 + ": " + (entero1 + entero2));
        System.out.println(entero1 + " - " + entero2 + ": " + (entero1 - entero2));
        System.out.println(entero1 + " * " + entero2 + ": " + (entero1 * entero2));
        System.out.println(entero1 + " / " + entero2 + ": " + (entero1 / entero2));
        System.out.println(entero1 + " % " + entero2 + ": " + (entero1 % entero2));

        System.out.println("Decimales");
        System.out.println(decimal1 + " + " + decimal2 + ": " + (decimal1 + decimal2));
        System.out.println(decimal1 + " - " + decimal2 + ": " + (decimal1 - decimal2));
        System.out.println(decimal1 + " * " + decimal2 + ": " + (decimal1 * decimal2));
        System.out.println(decimal1 + " / " + decimal2 + ": " + (decimal1 / decimal2));
        System.out.println(decimal1 + " % " + decimal2 + ": " + (decimal1 % decimal2));

        System.out.println("Enteros con decimales");
        System.out.println(entero1 + " + " + decimal1 + ": " + (entero1 + decimal1));
        System.out.println(entero1 + " - " + decimal1 + ": " + (entero1 - decimal1));
        System.out.println(entero1 + " * " + decimal1 + ": " + (entero1 * decimal1));
        System.out.println(entero1 + " / " + decimal1 + ": " + (entero1 / decimal1));
        System.out.println(entero1 + " % " + decimal1 + ": " + (entero1 % decimal1));
    }
}
