import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numeroStr;
        int numero;
        int factorial;

        System.out.print("Ingrese un número para ver su factorial: ");
        numeroStr = br.readLine();
        numero = Integer.parseInt(numeroStr);
        factorial = numero;

        if(numero > 0)
        {
            for(int i = 1; i < numero; i++)
            {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es " + factorial);
        }
        else
        {
            System.out.println("El número tiene que ser un entero positivo");
        }
    }
}