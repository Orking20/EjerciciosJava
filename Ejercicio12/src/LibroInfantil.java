public class LibroInfantil extends Libro {
    private int edadRecomendada = 12;

    public LibroInfantil(String titulo, String isbn, int numPaginas) {
        super(titulo, isbn, numPaginas);
    }

    public boolean esRecomendable(int edad){
        boolean retorno;

        if(edad <= edadRecomendada) {
            retorno = true;
        }
        else {
            retorno = false;
        }

        return retorno;
    }
}
