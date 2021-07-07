import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdivinarNumero
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int numeroSecreto;
        int respuesta;
        String respuestaStr;

        numeroSecreto = r.nextInt(100);

        System.out.println("Adivina el número entre el 0 al 100");

        do
        {
            System.out.print("Ingrese un número: ");
            respuestaStr = br.readLine();
            respuesta = Integer.parseInt(respuestaStr);

            if(respuesta > numeroSecreto)
            {
                System.out.println("El número es más chico");
            }
            else
            {
                System.out.println("El número es más grande");
            }
        }while(respuesta != numeroSecreto);

        System.out.println("Adivinaste!");
    }
}