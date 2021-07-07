import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nota
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String notaStr;
        int nota;

        System.out.print("Escriba una nota del 0 al 10: ");
        notaStr = br.readLine();
        nota = Integer.parseInt(notaStr);

        switch(nota)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            {
                System.out.println("Desaprobado");
                break;
            }
            case 4:
            case 5:
            {
                System.out.println("Aprobado sin promoción");
                break;
            }
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            {
                System.out.println("Aprobado con promoción");
                break;
            }
            default:
            {
                System.out.println("Error. Las notas son de 0 a 10");
            }
        }

    }
}
