import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cantidadNumerosStr;
        int cantidadNumeros;
        boolean error;

        do
        {
            try
            {
                System.out.print("Ingrese la cantidad de números de Fibonacci que desea ver: ");
                cantidadNumerosStr = br.readLine();
                cantidadNumeros = Integer.parseInt(cantidadNumerosStr);
                while(cantidadNumeros < 1)
                {
                    System.out.println("Error. Debes ingresar un número entero positivo!");
                    System.out.print("Ingrese la cantidad de números de Fibonacci que desea ver: ");
                    cantidadNumerosStr = br.readLine();
                    cantidadNumeros = Integer.parseInt(cantidadNumerosStr);
                }

                GetFibonacci(cantidadNumeros);

                error = false;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Error. Ingrese un número!");
                error = true;
            }
        }while(error);
    }

    static int GetFibonacci(int numeroLimite)
    {
        int numeroAnterior = 0;
        int numeroIncremento = 1;
        int numeroAuxiliar;

        System.out.println(numeroAnterior);

        for(int i = 0; i < numeroLimite - 1; i++)
        {
            System.out.println(numeroIncremento);
            numeroAuxiliar = numeroIncremento;
            numeroIncremento = numeroIncremento + numeroAnterior;
            numeroAnterior = numeroAuxiliar;
        }

        return 1;
    }
}
