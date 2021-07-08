public class NumerosPrimos {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++) {
            if(EsPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean EsPrimo(int numero) {
        boolean retorno = false;
        int contador = 0;

        for(int i = 1; i <= numero; i++) {
            if(numero % i == 0) {
                contador++;
            }
        }

        if(contador == 2) {
            retorno = true;
        }

        return retorno;
    }
}
