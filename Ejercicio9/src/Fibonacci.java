import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Fibonacci
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numeroStr;
        int numero;
        boolean error;

        do
        {
            try
            {
                System.out.print("Ingrese un número para obtener su fibonacci: ");
                numeroStr = br.readLine();
                numero = Integer.parseInt(numeroStr);
                while(numero < 1)
                {
                    System.out.println("Error. Ingrese un número entero positivo");
                    System.out.print("Ingrese un número para obtener su fibonacci: ");
                    numeroStr = br.readLine();
                    numero = Integer.parseInt(numeroStr);
                }

                System.out.println(GetFibonacci(numero));

                error = false;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Error. Solo puedes ingresar números");

                error = true;
            }
        }while(error);
    }

    static int GetFibonacci(int numero)
    {
        int retorno;

        if(numero < 2)
        {
            retorno = numero;
        }
        else
        {
            retorno = GetFibonacci(numero - 1) + GetFibonacci(numero - 2);
        }

        return retorno;
    }
}
