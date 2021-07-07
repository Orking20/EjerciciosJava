import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoraDia
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String horaStr;
        String minutosStr;
        int hora;
        int minutos;

        System.out.print("Ingrese la hora: ");
        horaStr = br.readLine();
        System.out.print("Ingrese los minutos: ");
        minutosStr = br.readLine();

        hora = Integer.parseInt(horaStr);
        minutos = Integer.parseInt(minutosStr);

        if(hora == 12)
        {
            System.out.println("Es el mediodía");
        }
        else if(hora == 24 || hora == 0)
        {
            System.out.println("Es la medianoche");
        }
        else if((hora >= 8 && minutos >= 1) && hora < 12)
        {
            System.out.println("Es la mañana");
        }
        else if((hora <= 17 && minutos <= 56) && hora > 12)
        {
            System.out.println("Es la tarde");
        }
        else
        {
            System.out.println("Es de noche");
        }
    }
}
